package com.hi8.mall.controller.base;

import com.hi8.mall.vo.CommonResult;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liumingchieh
 * @Date: Created in 2024/4/11 12:55
 * @Description: controller基类，封装统一返回方法
 */
public class BaseController {
    public <T> CommonResult<T> success(T data){
        return CommonResult.success(data);
    }

    public <T> CommonResult<T> success(){
        return CommonResult.success();
    }
}
