package cn.insectmk.dailyeats.framework.config;

import com.p6spy.engine.spy.appender.StdoutLogger;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description 日志打印配置
 * @Author makun
 * @Date 2024/10/12 17:50
 * @Version 1.0
 */
@Slf4j
public class StdoutLoggerConfig extends StdoutLogger {
    public void logText(String text) {
        log.info(text);
    }
}
