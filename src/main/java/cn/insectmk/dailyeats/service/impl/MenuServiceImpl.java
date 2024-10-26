package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.domain.entity.Menu;
import cn.insectmk.dailyeats.mapper.MenuMapper;
import cn.insectmk.dailyeats.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表，用于定义角色菜单 服务实现类
 * </p>
 *
 * @author makun
 * @since 2024-10-25
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
