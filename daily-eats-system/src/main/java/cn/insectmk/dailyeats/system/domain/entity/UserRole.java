package cn.insectmk.dailyeats.system.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 用户角色表，用于存储用户的角色
 * </p>
 *
 * @author makun
 * @since 2024-10-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user_role")
@Schema(name="TUserRole对象", description="用户角色表，用于存储用户的角色")
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "用户ID")
    @TableId(value = "user_id", type = IdType.ASSIGN_UUID)
    private String userId;

    @Schema(name = "角色ID")
    @TableField("role_id")
    private String roleId;
}
