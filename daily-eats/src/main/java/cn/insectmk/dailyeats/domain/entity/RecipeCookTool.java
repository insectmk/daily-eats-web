package cn.insectmk.dailyeats.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * <p>
 * 菜谱烹饪工具表，储存菜谱烹饪工具信息
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_recipe_cook_tool")
@Schema(name="RecipeCookTool对象", description="菜谱烹饪工具表，储存菜谱烹饪工具信息")
public class RecipeCookTool implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @Schema(name = "名称")
    private String name;

    @Schema(name = "类型")
    private String type;

    @Schema(name = "备注")
    private String memo;


}
