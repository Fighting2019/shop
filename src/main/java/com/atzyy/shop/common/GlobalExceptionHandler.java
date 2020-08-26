package com.atzyy.shop.common;

import com.atzyy.shop.exceptions.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理
 */
//@ControllerAdvice
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理 Exception 返回友好提示
     * @return
     */
    @ExceptionHandler(Exception.class)
    public CommonResponse exceptionHandler(Exception ex){
        log.error(ex.getMessage(),ex);
        return new  CommonResponse(BizConstant.ERROR_CODE,"服务器异常，请稍后重试！");
    }

    /**
     * 处理统一异常
     * @param ex
     * @return
     */
    @ExceptionHandler(CommonException.class)
    public CommonResponse commonExceptionHandler(CommonException ex){
        return new CommonResponse(ex.getCode(),ex.getMessage());
    }
}
