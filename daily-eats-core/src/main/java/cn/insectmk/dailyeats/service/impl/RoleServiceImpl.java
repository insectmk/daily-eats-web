package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.domain.entity.Role;
import cn.insectmk.dailyeats.mapper.RoleMapper;
import cn.insectmk.dailyeats.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表，用于定义用户角色 服务实现类
 * </p>
 *
 * @author makun
 * @since 2024-10-25
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
