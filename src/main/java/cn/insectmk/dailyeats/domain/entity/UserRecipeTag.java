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
 * 用户菜谱标签表，储存用户菜谱标签
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user_recipe_tag")
@Schema(name="TUserRecipeTag对象", description="用户菜谱标签表，储存用户菜谱标签")
public class UserRecipeTag implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @Schema(name = "用户ID")
    private String userId;

    @Schema(name = "菜谱ID")
    private String recipeId;

    @Schema(name = "名称")
    private String name;

    @Schema(name = "逻辑删除标志")
    @TableLogic
    private Boolean isDeleted;
}
