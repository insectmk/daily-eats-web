package cn.insectmk.dailyeats.controller.system;


import cn.insectmk.common.web.AjaxResult;
import cn.insectmk.dailyeats.service.IMenuService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 菜单表，用于定义角色菜单 前端控制器
 * </p>
 *
 * @author makun
 * @since 2024-10-25
 */
@RestController
@RequestMapping("/menu")
@Tag(name = "菜单")
public class MenuController {
    @Autowired
    private IMenuService menuService;

    /**
     * 获取所有的菜单
     * @return 结果
     */
    @RequestMapping("/getAll")
    public AjaxResult getAll() {
        return AjaxResult.success(menuService.list());
    }
}
