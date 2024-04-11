package com.yiqizhuan.mall.controller.base;

import com.yiqizhuan.mall.enums.ResponseCodeEnum;
import com.yiqizhuan.mall.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: liumingchieh
 * @Date: Created in 2024/4/11 13:09
 * @Description: 统一异常处理
 */
@RestControllerAdvice
@Slf4j
public class BaseGlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public CommonResult handleBaseException(Exception e){
        return CommonResult.fail(ResponseCodeEnum.INTERNAL_ERROR);
    }
}
