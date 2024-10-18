package cn.insectmk.dailyeats.framework.service;

import cn.insectmk.dailyeats.common.exception.ServiceException;
import cn.insectmk.dailyeats.framework.domain.model.SysUser;
import cn.insectmk.dailyeats.system.domain.entity.User;
import cn.insectmk.dailyeats.system.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Description SpringSecurity-用户认证处理
 * @Author makun
 * @Date 2024/10/16 19:41
 * @Version 1.0
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 根据用户名查询用户信息
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername, username);
        User user = userMapper.selectOne(queryWrapper);
        // 查不出则报错
        if (Objects.isNull(user)) {
            throw new ServiceException("用户名或密码错误");
        }
        return new SysUser(user);
    }
}
