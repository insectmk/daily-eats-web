package cn.insectmk.dailyeats.system.domain.entity;

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
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表，储存用户信息
 * </p>
 *
 * @author makun
 * @since 2024-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
@Schema(name="User对象", description="用户表，储存用户信息")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @Schema(name = "昵称")
    private String name;

    @Schema(name = "用户名")
    private String username;

    @Schema(name = "密码")
    private String password;

    @Schema(name = "头像")
    private String head;

    @Schema(name = "出生年月日")
    private LocalDate birthday;

    @Schema(name = "身高")
    private Float height;

    @Schema(name = "体重")
    private Float weight;

    @Schema(name = "性别")
    private String gender;

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
    @TableLogic
    private Boolean isDeleted;
}
