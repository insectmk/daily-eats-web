package cn.insectmk.dailyeats.core.controller;

import cn.insectmk.dailyeats.common.web.AjaxResult;
import cn.insectmk.dailyeats.system.service.IUserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/core/user")
@Tag(name = "用户")
public class UserController {
    @Autowired
    private IUserService userService; // 用户服务

    /**
     * 获取所有用户信息
     * @return 处理结果
     */
    @GetMapping("/getAll")
    public AjaxResult getUser(){
        return AjaxResult.success(userService.list());
    }
}
