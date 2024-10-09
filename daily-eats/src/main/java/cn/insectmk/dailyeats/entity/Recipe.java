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
 * 菜谱表，储存菜谱信息
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_recipe")
@ApiModel(value="TRecipe对象", description="菜谱表，储存菜谱信息")
public class Recipe implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "简介")
    private String desc;

    @ApiModelProperty(value = "教程")
    private String step;

    @ApiModelProperty(value = "菜谱类型")
    private String recipeType;

    @ApiModelProperty(value = "几人份")
    private Integer numPeople;

    @ApiModelProperty(value = "热量")
    private Integer calories;

    @ApiModelProperty(value = "烹饪难度")
    private Integer level;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "是否公开")
    private Boolean isPub;

    @ApiModelProperty(value = "录入时间")
    private LocalDateTime inputDate;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyDate;


}
