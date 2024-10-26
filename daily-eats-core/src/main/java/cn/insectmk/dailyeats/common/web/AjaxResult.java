package cn.insectmk.dailyeats.common.web;

import cn.insectmk.common.constant.ResponseCode;
import java.io.Serial;
import java.util.HashMap;

/**
 * @Description 统一返回对象
 * @Author makun
 * @Date 2024/10/9 17:23
 * @Version 1.0
 */
public class AjaxResult extends HashMap<String, Object> {
    @Serial
    private static final long serialVersionUID = 1L;

    /** 状态码 */
    public static final String CODE_TAG = "code";
    /** 返回内容 */
    public static final String MSG_TAG = "msg";
    /** 数据对象 */
    public static final String DATA_TAG = "data";

    /**
     * 创建一个空的返回对象
     */
    public AjaxResult() {
        put("code", ResponseCode.SUCCESS);
        put("msg", "");
        put("data", null);
    }

    /**
     * 创建一个指定返回内容的对象
     * @param code 状态码
     * @param msg 返回消息
     * @param data 返回内容
     */
    public AjaxResult(int code, String msg, Object data) {
        put("code", code);
        put("msg", msg);
        put("data", data);
    }

    /**
     * 快速创建一个失败返回对象
     * @param code 错误代码
     * @param message 消息
     * @return 处理结果
     */
    public static AjaxResult fail(int code, String message) {
        return new AjaxResult(code, message, null);
    }

    /**
     * 快速创建一个错误返回对象
     * @param code 错误代码
     * @param message 消息
     * @return 处理结果
     */
    public static AjaxResult error(int code, String message) {
        return new AjaxResult(code, message, null);
    }

    /**
     * 用于链式调用
     * @param key 键
     * @param value 值
     * @return 处理结果
     */
    @Override
    public AjaxResult put(String key, Object value)
    {
        super.put(key, value);
        return this;
    }

    /**
     * 快捷返回一个成功对象
     * @return 处理结果
     */
    public static AjaxResult success() {
        return new AjaxResult(ResponseCode.SUCCESS, "success", null);
    }

    /**
     * 快捷返回一个成功对象
     * @param data 返回的数据
     * @return 处理结果
     */
    public static AjaxResult success(Object data) {
        return new AjaxResult(ResponseCode.SUCCESS, "success", data);
    }

    /**
     * 快捷返回一个成功对象
     * @param msg 返回的消息
     * @param data 返回的数据
     * @return 处理结果
     */
    public static AjaxResult success(String msg, Object data) {
        return new AjaxResult(ResponseCode.SUCCESS, msg, data);
    }
}
