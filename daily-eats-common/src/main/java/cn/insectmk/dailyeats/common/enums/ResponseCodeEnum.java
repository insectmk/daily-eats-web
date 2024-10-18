package cn.insectmk.dailyeats.common.enums;

import lombok.Getter;

/**
 * @Description 返回状态代码
 * @Author makun
 * @Date 2024/10/15 17:45
 * @Version 1.0
 */
@Getter
public enum ResponseCodeEnum {
    SUCCESS(200, "成功"),
    FAIL_USER(400, "用户输入错误"),
    USER_NOT_LOGIN(401, "用户未登录"),
    SYSTEM_ERROR(500, "系统错误"),
    ;

    /** 状态码*/
    private final int code;
    /** 状态描述*/
    private final String desc;

    /**
     * 构造
     * @param code 状态码
     * @param desc 状态描述
     */
    ResponseCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
