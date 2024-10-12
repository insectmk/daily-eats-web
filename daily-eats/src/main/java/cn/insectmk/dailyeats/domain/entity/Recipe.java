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
import java.time.LocalDateTime;

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
@Schema(name="Recipe对象", description="菜谱表，储存菜谱信息")
public class Recipe implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @Schema(name = "名称")
    private String name;

    @Schema(name = "简介")
    private String desc;

    @Schema(name = "教程")
    private String step;

    @Schema(name = "菜谱类型")
    private String recipeType;

    @Schema(name = "几人份")
    private Integer numPeople;

    @Schema(name = "热量")
    private Integer calories;

    @Schema(name = "烹饪难度")
    private Integer level;

    @Schema(name = "排序")
    private Integer sort;

    @Schema(name = "是否公开")
    private Boolean isPub;

    @Schema(name = "录入时间")
    private LocalDateTime inputDate;

    @Schema(name = "修改时间")
    private LocalDateTime modifyDate;

    @Schema(name = "逻辑删除标志")
    @TableLogic
    private Boolean isDeleted;
}
