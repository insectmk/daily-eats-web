package cn.insectmk.dailyeats.aop.web;

import cn.insectmk.dailyeats.common.exception.ServiceException;
import cn.insectmk.dailyeats.common.web.AjaxResult;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description 全局异常处理器
 * @Author makun
 * @Date 2024/10/16 13:48
 * @Version 1.0
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 业务异常
     * @param e 业务异常
     * @param request 请求
     * @return 异常结果
     */
    @ExceptionHandler(ServiceException.class)
    public AjaxResult handleServiceException(ServiceException e, HttpServletRequest request)
    {
        log.error(e.getMessage(), e);
        return AjaxResult.error(e.getCode(), e.getMessage());
    }
}
