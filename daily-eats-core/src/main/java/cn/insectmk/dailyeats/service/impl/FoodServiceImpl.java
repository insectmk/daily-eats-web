package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.domain.entity.Food;
import cn.insectmk.dailyeats.mapper.FoodMapper;
import cn.insectmk.dailyeats.service.IFoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 食材表，储存原料信息 服务实现类
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements IFoodService {

}
