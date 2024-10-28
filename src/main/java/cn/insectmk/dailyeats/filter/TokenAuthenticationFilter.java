package cn.insectmk.dailyeats.filter;

import cn.insectmk.dailyeats.common.constant.ResponseCode;
import cn.insectmk.dailyeats.common.exception.ServiceException;
import cn.insectmk.dailyeats.service.TokenService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;

@Component
public class TokenAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    private TokenService tokenService;

    /**
     * 拦截后需要做的事
     * @param request
     * @param response
     * @param filterChain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String token = request.getHeader("Authorization"); // 从请求头中获取token
        if (token != null && !token.isEmpty()) {
            Jws<Claims> claimsJws = null;
            try {
                claimsJws = tokenService.parseToken(token);
            } catch (Exception e) {
                throw new ServiceException(ResponseCode.UNAUTHORIZED, "令牌无效");
            }
            if (claimsJws != null) {
                // 从token中获取用户信息，将用户信息放入请求头中
                request.setAttribute("userId", claimsJws.getPayload().get("id"));
            } else {
                throw new ServiceException(ResponseCode.UNAUTHORIZED, "令牌无效");
            }
        } else {
            throw new ServiceException(ResponseCode.UNAUTHORIZED, "令牌缺失");
        }
        filterChain.doFilter(request, response); // 放行请求
    }

    /**
     * 不需要拦截的URL
     * @param request
     * @return
     * @throws ServletException
     */
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        // 获取请求的URI
        String path = request.getRequestURI();
        // 定义要排除的URL路径
        return path.startsWith("/login/action")
                || path.equals("/test/hello");
    }
}
