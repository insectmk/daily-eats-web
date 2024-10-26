package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.domain.entity.Recipe;
import cn.insectmk.dailyeats.mapper.RecipeMapper;
import cn.insectmk.dailyeats.service.IRecipeService;
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
