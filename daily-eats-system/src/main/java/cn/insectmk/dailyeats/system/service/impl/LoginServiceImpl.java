package cn.insectmk.dailyeats.system.service.impl;

import cn.insectmk.dailyeats.common.enums.ExceptionCodeEnum;
import cn.insectmk.dailyeats.common.exception.ServiceException;
import cn.insectmk.dailyeats.system.domain.dto.LoginUserDto;
import cn.insectmk.dailyeats.system.domain.entity.User;
import cn.insectmk.dailyeats.system.service.IUserService;
import cn.insectmk.dailyeats.system.service.LoginService;
import cn.insectmk.dailyeats.system.service.TokenService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private IUserService userService;

    /**
     * 用户登录
     * @param loginUserDto 登录信息
     * @return Jwt令牌
     */
    @Override
    public String login(LoginUserDto loginUserDto) {
        // 判断信息是否正确
        User loginUser = userService.getOne(new LambdaQueryWrapper<User>()
                .eq(User::getUsername, loginUserDto.getUsername())
                .eq(User::getPassword, loginUserDto.getPassword()));
        if (loginUser == null) {
            throw new ServiceException("用户名或密码错误", ExceptionCodeEnum.FAIL_USER.getCode());
        }
        // 生成token
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", loginUser.getId());
        claims.put("username", loginUserDto.getUsername());
        return tokenService.getToken(claims);
    }
}
