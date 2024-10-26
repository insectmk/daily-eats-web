package cn.insectmk.dailyeats.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 菜单表，用于定义角色菜单
 * </p>
 *
 * @author makun
 * @since 2024-10-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_menu")
@Schema(name="菜单对象", description="菜单表，用于定义角色菜单")
public class Menu implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @Schema(name = "名称")
    @TableField("name")
    private String name;

    @Schema(name = "父菜单ID")
    @TableField("parent_id")
    private String parentId;

    @Schema(name = "路由地址")
    @TableField("path")
    private String path;

    @Schema(name = "菜单状态（0正常 1停用）")
    @TableField("status")
    private String status;

    @Schema(name = "菜单图标")
    @TableField("icon")
    private String icon;

    @Schema(name = "排序")
    @TableField("sort")
    private Integer sort;

    @Schema(name = "录入人")
    private String inputBy;

    @Schema(name = "录入时间")
    private LocalDateTime inputTime;

    @Schema(name = "修改人")
    private String modifyBy;

    @Schema(name = "修改时间")
    private LocalDateTime modifyTime;

    @Schema(name = "备注")
    private String memo;

    @Schema(name = "逻辑删除标志")
    @TableField("is_deleted")
    @TableLogic
    private Boolean isDeleted;
}
