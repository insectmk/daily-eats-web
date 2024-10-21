package cn.insectmk.dailyeats.framework.service.impl;

import cn.insectmk.dailyeats.framework.domain.model.SysUser;
import cn.insectmk.dailyeats.framework.security.context.AuthenticationContextHolder;
import cn.insectmk.dailyeats.framework.service.LoginService;
import cn.insectmk.dailyeats.system.domain.dto.LoginUserDto;
import cn.insectmk.dailyeats.system.service.IUserService;
import cn.insectmk.dailyeats.system.service.TokenService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 登录服务接口实现
 * @Author makun
 * @Date 2024/10/14 18:00
 * @Version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    /** 用于生成JWT令牌*/
    @Autowired
    private TokenService tokenService;
    @Resource
    private AuthenticationManager authenticationManager;

    /**
     * 用户登录
     * @param loginUserDto 登录信息
     * @return Jwt令牌
     */
    @Override
    public String login(LoginUserDto loginUserDto) {
        // 用户验证
        Authentication authentication = null;
        try
        {
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginUserDto.getUsername(), loginUserDto.getPassword());
            AuthenticationContextHolder.setContext(authenticationToken);
            // 该方法会去调用UserDetailsServiceImpl.loadUserByUsername
            authentication = authenticationManager.authenticate(authenticationToken);
        } finally
        {
            AuthenticationContextHolder.clearContext();
        }
        SysUser loginUser = (SysUser) authentication.getPrincipal();
        // 生成token
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", loginUser.getUser().getId());
        claims.put("username", loginUser.getUser().getUsername());
        return tokenService.getToken(claims);
    }
}
