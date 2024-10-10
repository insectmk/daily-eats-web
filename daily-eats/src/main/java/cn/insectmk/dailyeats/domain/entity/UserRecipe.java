package cn.insectmk.dailyeats.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户菜谱表，储存用户的菜谱信息
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user_recipe")
@Schema(name="UserRecipe对象", description="用户菜谱表，储存用户的菜谱信息")
public class UserRecipe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @Schema(name = "用户ID")
    private String userId;

    @Schema(name = "菜谱ID")
    private String recipeId;

    @Schema(name = "备注")
    private String memo;

    @Schema(name = "排序")
    private Integer sort;

    @Schema(name = "录入时间")
    private LocalDateTime inputDate;


}
