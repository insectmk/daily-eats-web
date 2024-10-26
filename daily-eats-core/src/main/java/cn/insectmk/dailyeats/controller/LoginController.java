package cn.insectmk.dailyeats.controller;

import cn.insectmk.common.web.AjaxResult;
import cn.insectmk.dailyeats.domain.dto.LoginUserDto;
import cn.insectmk.dailyeats.service.LoginService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 用户登录控制
 * @Author makun
 * @Date 2024/10/14 17:57
 * @Version 1.0
 */
@RestController
@RequestMapping("/login")
@Tag(name = "登录控制")
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 用户登录
     * @param loginUserDto 登录信息
     * @return JWT令牌
     */
    @RequestMapping("/action")
    public AjaxResult action(@RequestBody LoginUserDto loginUserDto) {
        return AjaxResult.success(loginService.login(loginUserDto));
    }
}
