package cn.insectmk.dailyeats.core.service.impl;

import cn.insectmk.dailyeats.core.domain.entity.Recipe;
import cn.insectmk.dailyeats.core.mapper.RecipeMapper;
import cn.insectmk.dailyeats.core.service.IRecipeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜谱表，储存菜谱信息 服务实现类
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Service
public class RecipeServiceImpl extends ServiceImpl<RecipeMapper, Recipe> implements IRecipeService {

}
