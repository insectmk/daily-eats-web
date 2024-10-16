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
    SUCCESS(0, "成功"),
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
