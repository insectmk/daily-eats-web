package cn.insectmk.dailyeats.framework.security.filter;

import cn.insectmk.dailyeats.common.enums.ResponseCodeEnum;
import cn.insectmk.dailyeats.common.exception.ServiceException;
import cn.insectmk.dailyeats.framework.domain.model.SysUser;
import cn.insectmk.dailyeats.system.service.TokenService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;

/**
 * @Description 用于Json Web Token认证
 * @Author makun
 * @Date 2024/10/16 20:14
 * @Version 1.0
 */
//@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    // 请求头Token存放位置
    @Value("${token.header}")
    private String subject;
    @Autowired
    private TokenService tokenService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 从请求头中获取Token
        String jwtToken = request.getHeader(subject);
        SysUser sysUser = null;
        try {
            sysUser = new SysUser(tokenService.getUser(jwtToken));
        } catch (Exception e) {
            throw new ServiceException(ResponseCodeEnum.USER_NOT_LOGIN, "登录状态失效");
        }
        // 存入SecurityContextHolder
        // TODO 待理解 2024/10/16 20:24
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(sysUser, null, sysUser.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        // 放行
        filterChain.doFilter(request, response);
    }
}
