package cn.insectmk.dailyeats.system.service.impl;

import cn.insectmk.dailyeats.system.domain.dto.LoginUserDto;
import cn.insectmk.dailyeats.system.service.IUserService;
import cn.insectmk.dailyeats.system.service.LoginService;
import cn.insectmk.dailyeats.system.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    @Autowired
    private IUserService userService;

    /**
     * 用户登录
     * @param loginUserDto 登录信息
     * @return
     */
    @Override
    public String login(LoginUserDto loginUserDto) {
        // 判断信息是否正确
        // 生成token
        return tokenService.getToken(null);
    }
}
