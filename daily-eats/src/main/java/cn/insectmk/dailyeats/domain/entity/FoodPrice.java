package cn.insectmk.dailyeats.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 食材价格表，储存价格信息
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_food_price")
@Schema(name="FoodPrice对象", description="食材价格表，储存价格信息")
public class FoodPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @Schema(name = "食材ID")
    private String foodId;

    @Schema(name = "单价")
    private BigDecimal price;

    @Schema(name = "备注")
    private String memo;

    @Schema(name = "录入时间")
    private LocalDateTime inputDate;


}
