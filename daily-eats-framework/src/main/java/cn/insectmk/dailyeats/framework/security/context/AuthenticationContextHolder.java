package cn.insectmk.dailyeats.framework.security.context;

import org.springframework.security.core.Authentication;

/**
 * @Description 身份验证信息
 * @Author makun
 * @Date 2024/10/19 17:52
 * @Version 1.0
 */
// TODO 迷惑
public class AuthenticationContextHolder {
    private static final ThreadLocal<Authentication> contextHolder = new ThreadLocal<>();

    public static Authentication getContext()
    {
        return contextHolder.get();
    }

    public static void setContext(Authentication context)
    {
        contextHolder.set(context);
    }

    public static void clearContext()
    {
        contextHolder.remove();
    }
}
