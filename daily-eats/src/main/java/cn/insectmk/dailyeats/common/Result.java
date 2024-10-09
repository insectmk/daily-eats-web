package cn.insectmk.dailyeats.common;

import cn.insectmk.dailyeats.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description 统一返回类型
 * @Author makun
 * @Date 2024/10/9 17:23
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    public static final int SUCCESS = 200;

    private int code;
    private String msg;
    private T data;

    /**
     * 成功返回
     * @param data
     * @return
     * @param <T>
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(SUCCESS, "成功", data);
    }

    /**
     * 成功返回
     * @return
     */
    public static Result<Object> success() {
        return new Result<>(SUCCESS, "成功", null);
    }
}
