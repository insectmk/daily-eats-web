package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.domain.entity.User;
import cn.insectmk.dailyeats.mapper.UserMapper;
import cn.insectmk.dailyeats.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表，储存用户信息 服务实现类
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
