package cn.insectmk.dailyeats.common;

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
        put("code", 0);
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
        return new AjaxResult(0, "success", null);
    }

    /**
     * 快捷返回一个成功对象
     * @param msg 返回的消息
     * @return 处理结果
     */
    public static AjaxResult success(String msg) {
        return new AjaxResult(0, msg, null);
    }

    /**
     * 快捷返回一个成功对象
     * @param data 返回的数据
     * @return 处理结果
     */
    public static AjaxResult success(Object data) {
        return new AjaxResult(0, "success", data);
    }

    /**
     * 快捷返回一个成功对象
     * @param msg 返回的消息
     * @param data 返回的数据
     * @return 处理结果
     */
    public static AjaxResult success(String msg, Object data) {
        return new AjaxResult(0, msg, data);
    }
}
