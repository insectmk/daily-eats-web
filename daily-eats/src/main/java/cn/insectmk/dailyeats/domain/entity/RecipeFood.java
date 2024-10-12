package cn.insectmk.dailyeats.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

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
@Schema(name="RecipeFood对象", description="菜谱食材表，储存菜谱的食材信息")
public class RecipeFood implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @Schema(name = "菜谱ID")
    private String recipeId;

    @Schema(name = "食材ID")
    private String foodId;

    @Schema(name = "量")
    private Float amount;

    @Schema(name = "备注")
    private String memo;

    @Schema(name = "逻辑删除标志")
    @TableLogic
    private Boolean isDeleted;
}
