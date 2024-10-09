package cn.insectmk.dailyeats.controller;

import cn.insectmk.dailyeats.common.Result;
import cn.insectmk.dailyeats.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表，储存用户信息 前端控制器
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/getUser")
    public Result<?> getUser(){
        return Result.success(userService.list());
    }
}
