package cn.insectmk.dailyeats.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @Schema(name = "身高")
    private Float height;

    @Schema(name = "体重")
    private Float weight;

    @Schema(name = "性别")
    private String gender;

    @Schema(name = "创建者")
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    @Schema(name = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @Schema(name = "更新者")
    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;

    @Schema(name = "更新时间")
    @TableField(fill = FieldFill.UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    @Schema(name = "备注")
    private String memo;

    @Schema(name = "逻辑删除标志")
    @TableLogic
    private Boolean isDeleted;
}
