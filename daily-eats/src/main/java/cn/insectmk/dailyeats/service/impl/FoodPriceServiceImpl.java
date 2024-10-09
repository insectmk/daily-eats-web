package cn.insectmk.dailyeats.service.impl;

import cn.insectmk.dailyeats.entity.FoodPrice;
import cn.insectmk.dailyeats.mapper.FoodPriceMapper;
import cn.insectmk.dailyeats.service.IFoodPriceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 食材价格表，储存价格信息 服务实现类
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Service
public class FoodPriceServiceImpl extends ServiceImpl<FoodPriceMapper, FoodPrice> implements IFoodPriceService {

}
