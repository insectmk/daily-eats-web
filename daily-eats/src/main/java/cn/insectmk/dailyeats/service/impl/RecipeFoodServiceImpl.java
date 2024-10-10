package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.domain.entity.RecipeFood;
import cn.insectmk.dailyeats.mapper.RecipeFoodMapper;
import cn.insectmk.dailyeats.service.IRecipeFoodService;
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
