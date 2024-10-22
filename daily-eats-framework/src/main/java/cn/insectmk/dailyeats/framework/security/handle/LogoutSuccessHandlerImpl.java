package cn.insectmk.dailyeats.framework.security.handle;

import cn.insectmk.dailyeats.common.web.AjaxResult;
import cn.insectmk.dailyeats.system.domain.entity.User;
import cn.insectmk.dailyeats.system.service.TokenService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import java.io.IOException;

/**
 * 自定义退出处理类 返回成功
 *
 * @author ruoyi
 */
@Configuration
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler
{
    @Autowired
    private TokenService tokenService;
    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 退出处理
     * @return
     */
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        User user = tokenService.getUser(request.getHeader("Authorization"));
        if (user != null) {
            String userName = user.getUsername();
        }
        response.setStatus(200);
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        response.getWriter().print(objectMapper.writeValueAsString(AjaxResult.success("认证失败，无法访问系统资源！", null)));
    }
}
