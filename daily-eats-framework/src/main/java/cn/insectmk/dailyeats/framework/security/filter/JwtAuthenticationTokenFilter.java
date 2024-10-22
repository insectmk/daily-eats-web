package cn.insectmk.dailyeats.framework.security.filter;

import cn.insectmk.dailyeats.common.constant.ResponseCode;
import cn.insectmk.dailyeats.common.exception.ServiceException;
import cn.insectmk.dailyeats.framework.domain.model.SysUser;
import cn.insectmk.dailyeats.system.service.TokenService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * @Description 用于Json Web Token认证
 * @Author makun
 * @Date 2024/10/16 20:14
 * @Version 1.0
 */
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    /** JWT令牌服务*/
    private TokenService tokenService;

    public JwtAuthenticationTokenFilter(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    public JwtAuthenticationTokenFilter() {
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 从请求头中获取Token
        System.err.println("马某测试测试测试");
        String jwtToken = request.getHeader("Authorization");
        SysUser sysUser = null;
        try {
            sysUser = new SysUser(tokenService.getUser(jwtToken));
        } catch (Exception e) {
            throw new ServiceException(ResponseCode.UNAUTHORIZED, "登录状态失效");
        }
        // 存入SecurityContextHolder
        // TODO 待理解 2024/10/16 20:24
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(sysUser, null, sysUser.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        // 放行
        filterChain.doFilter(request, response);
    }
}
