package cn.insectmk.dailyeats.system.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色菜单表，用于存储角色的菜单
 * </p>
 *
 * @author makun
 * @since 2024-10-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_role_menu")
@Schema(name="RoleMenu对象", description="角色菜单表，用于存储角色的菜单")
public class RoleMenu implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "角色ID")
    @TableId(value = "role_id", type = IdType.ASSIGN_UUID)
    private String roleId;

    @Schema(name = "菜单ID")
    @TableField("menu_id")
    private String menuId;
}
