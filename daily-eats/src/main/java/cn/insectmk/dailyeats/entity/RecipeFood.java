package cn.insectmk.dailyeats.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜谱食材表，储存菜谱的食材信息
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_recipe_food")
@ApiModel(value="TRecipeFood对象", description="菜谱食材表，储存菜谱的食材信息")
public class RecipeFood implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty(value = "菜谱ID")
    private String recipeId;

    @ApiModelProperty(value = "食材ID")
    private String foodId;

    @ApiModelProperty(value = "量")
    private Float amount;

    @ApiModelProperty(value = "备注")
    private String memo;


}
