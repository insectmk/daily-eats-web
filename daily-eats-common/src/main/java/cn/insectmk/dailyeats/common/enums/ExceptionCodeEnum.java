package cn.insectmk.dailyeats.common.enums;

import lombok.Getter;

/**
 * @Description 异常代码
 * @Author makun
 * @Date 2024/10/15 17:45
 * @Version 1.0
 */
@Getter
public enum ExceptionCodeEnum {
    FAIL_USER(400, "用户输入错误"),
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
    ExceptionCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
