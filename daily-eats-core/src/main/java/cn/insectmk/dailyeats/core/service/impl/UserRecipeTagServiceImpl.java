package cn.insectmk.dailyeats.core.service.impl;

import cn.insectmk.dailyeats.core.domain.entity.UserRecipeTag;
import cn.insectmk.dailyeats.core.mapper.UserRecipeTagMapper;
import cn.insectmk.dailyeats.core.service.IUserRecipeTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户菜谱标签表，储存用户菜谱标签 服务实现类
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Service
public class UserRecipeTagServiceImpl extends ServiceImpl<UserRecipeTagMapper, UserRecipeTag> implements IUserRecipeTagService {

}
