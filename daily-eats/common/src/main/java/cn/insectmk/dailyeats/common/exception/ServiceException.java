package cn.insectmk.dailyeats.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serial;

/**
 * @Description 业务异常
 * @Author makun
 * @Date 2024/10/14 19:06
 * @Version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ServiceException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    /** 错误码*/
    private Integer code;
    /** 错误提示*/
    private String message;

    /** 错误明细，内部调试错误*/
    private String detailMessage;

    /** 空构造方法，避免反序列化问题*/
    public ServiceException() {}

    /**
     * 创建一个带信息的业务异常
     * @param message 错误信息
     */
    public ServiceException(String message)
    {
        this.message = message;
    }
    /**
     * 创建一个带信息与状态码的业务异常
     * @param message 错误信息
     */
    public ServiceException(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    /**
     * 获取错误信息
     * @return 错误信息
     */
    @Override
    public String getMessage()
    {
        return message;
    }
}
