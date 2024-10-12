package cn.insectmk.dailyeats.config;

/**
 * @Description 日志打印配置
 * @Author makun
 * @Date 2024/10/12 17:50
 * @Version 1.0
 */
public class StdoutLogger extends com.p6spy.engine.spy.appender.StdoutLogger {
    public void logText(String text) {
        System.err.println(text);
    }
}
