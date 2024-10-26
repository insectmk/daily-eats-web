package cn.insectmk.dailyeats.controller.system;

import cn.insectmk.common.web.AjaxResult;
import cn.insectmk.dailyeats.domain.entity.Role;
import cn.insectmk.dailyeats.service.IRoleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 角色表，用于定义用户角色 前端控制器
 * </p>
 *
 * @author makun
 * @since 2024-10-25
 */
@RestController
@RequestMapping("/role")
@Tag(name = "角色")
public class RoleController {
    @Autowired
    private IRoleService roleService;

    /**
     * 新增角色
     * @param role 角色信息
     * @return 新增结果
     */
    @RequestMapping("/add")
    public AjaxResult add(@RequestBody Role role) {
        roleService.save(role);
        return AjaxResult.success();
    }

    /**
     * 获取所有的角色
     * @return 结果
     */
    @RequestMapping("/getAll")
    public AjaxResult getAll() {
        return AjaxResult.success(roleService.list());
    }
}
