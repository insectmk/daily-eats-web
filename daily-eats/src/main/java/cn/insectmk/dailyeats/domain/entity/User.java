package cn.insectmk.dailyeats.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
@ApiModel(value="TUser对象", description="用户表，储存用户信息")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty(value = "昵称")
    private String name;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "头像")
    private String head;

    @ApiModelProperty(value = "出生年月日")
    private LocalDate birthday;

    @ApiModelProperty(value = "身高")
    private Float height;

    @ApiModelProperty(value = "体重")
    private Float weight;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "录入时间")
    private LocalDateTime inputDate;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyDate;


}
