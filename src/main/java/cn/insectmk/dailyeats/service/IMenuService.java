package cn.insectmk.dailyeats.service;

import cn.insectmk.dailyeats.domain.entity.Menu;
import cn.insectmk.dailyeats.domain.vo.MenuVo;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * <p>
 * 菜单表，用于定义角色菜单 服务类
 * </p>
 *
 * @author makun
 * @since 2024-10-25
 */
public interface IMenuService extends IService<Menu> {
    /**
     * 获取用户的菜单
     * @param userId 用户ID
     * @return 树形结构菜单
     */
    List<MenuVo> getUserMenuTree(String userId);
}
