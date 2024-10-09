package cn.insectmk.dailyeats.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@ApiModel(value="TUserRecipe对象", description="用户菜谱表，储存用户的菜谱信息")
public class UserRecipe implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "菜谱ID")
    private String recipeId;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "录入时间")
    private LocalDateTime inputDate;


}
