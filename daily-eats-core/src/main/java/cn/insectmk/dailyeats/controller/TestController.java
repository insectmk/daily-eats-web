package cn.insectmk.dailyeats.controller;

import cn.insectmk.common.web.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试控制器
 * @Author makun
 * @Date 2024/10/21 19:32
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
@Tag(name = "测试")
public class TestController {
    @RequestMapping("/hello")
    public AjaxResult hello() {
        return AjaxResult.success("你好，每日饭菜！！！");
    }

    @RequestMapping("/bye")
    public AjaxResult bye() {
        return AjaxResult.success("再见，每日饭菜！！！");
    }
}
