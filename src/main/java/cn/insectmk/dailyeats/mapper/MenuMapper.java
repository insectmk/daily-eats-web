package cn.insectmk.dailyeats.mapper;

import cn.insectmk.dailyeats.domain.entity.Menu;
import cn.insectmk.dailyeats.domain.vo.MenuVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 菜单表，用于定义角色菜单 Mapper 接口
 * </p>
 *
 * @author makun
 * @since 2024-10-25
 */
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * 获取用户的菜单
     * @param userId 用户ID
     * @return 树形结构菜单
     */
    List<MenuVo> selectUserMenuTree(@Param("userId") String userId);

    /**
     * 根据父级菜单ID查询子级菜单
     * @param parentId 父级菜单ID
     * @return 子级菜单树
     */
    List<MenuVo> selectMenuByParentId(@Param("parentId") String parentId);
}
