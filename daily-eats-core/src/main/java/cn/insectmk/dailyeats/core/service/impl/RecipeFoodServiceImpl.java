package cn.insectmk.dailyeats.core.service.impl;

import cn.insectmk.dailyeats.core.domain.entity.RecipeFood;
import cn.insectmk.dailyeats.core.mapper.RecipeFoodMapper;
import cn.insectmk.dailyeats.core.service.IRecipeFoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜谱食材表，储存菜谱的食材信息 服务实现类
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Service
public class RecipeFoodServiceImpl extends ServiceImpl<RecipeFoodMapper, RecipeFood> implements IRecipeFoodService {

}
