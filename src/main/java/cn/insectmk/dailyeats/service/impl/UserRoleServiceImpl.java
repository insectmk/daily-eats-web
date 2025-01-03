package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.domain.entity.UserRole;
import cn.insectmk.dailyeats.mapper.UserRoleMapper;
import cn.insectmk.dailyeats.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表，用于存储用户的角色 服务实现类
 * </p>
 *
 * @author makun
 * @since 2024-10-25
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
