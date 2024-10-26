package cn.insectmk.dailyeats.service;


import cn.insectmk.dailyeats.domain.dto.LoginUserDto;

/**
 * @Description 登录服务接口
 * @Author makun
 * @Date 2024/10/14 18:00
 * @Version 1.0
 */
public interface LoginService {
    /**
     * 登录
     * @param loginUserDto 登录信息
     * @return 返回JSON Web Token字符串
     */
    String login(LoginUserDto loginUserDto);
}
