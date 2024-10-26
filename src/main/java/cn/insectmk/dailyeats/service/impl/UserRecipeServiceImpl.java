package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.domain.entity.UserRecipe;
import cn.insectmk.dailyeats.mapper.UserRecipeMapper;
import cn.insectmk.dailyeats.service.IUserRecipeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户菜谱表，储存用户的菜谱信息 服务实现类
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Service
public class UserRecipeServiceImpl extends ServiceImpl<UserRecipeMapper, UserRecipe> implements IUserRecipeService {

}
