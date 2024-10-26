package cn.insectmk.dailyeats.core.controller.system;

import cn.insectmk.dailyeats.common.web.AjaxResult;
import cn.insectmk.dailyeats.system.domain.entity.User;
import cn.insectmk.dailyeats.system.service.IUserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@Tag(name = "用户")
public class UserController {
    @Autowired
    private IUserService userService; // 用户服务

    /**
     * 插入一个用户
     * @param user 用户信息
     * @return 处理结果
     */
    @GetMapping("/add")
    public AjaxResult add(@RequestBody User user) {
        userService.save(user);
        return AjaxResult.success();
    }

    /**
     * 获取当前用户信息
     * @param userId 用户id
     * @return 处理结果
     */
    @GetMapping("/getInfo")
    public AjaxResult getInfo(@RequestAttribute("userId") String userId){
        return AjaxResult.success(userService.getById(userId));
    }

    /**
     * 获取所有用户信息
     * @return 处理结果
     */
    @GetMapping("/getAll")
    public AjaxResult getUser(){
        return AjaxResult.success(userService.list());
    }
}
