package com.hi8.mall.controller;

import com.hi8.mall.controller.base.BaseController;
import com.hi8.mall.mapper.UserDAO;
import com.hi8.mall.model.User;
import com.hi8.mall.model.UserExample;
import com.hi8.mall.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: liumingchieh
 * @Date: Created in 2024/4/11 3:24
 * @Description: 测试
 */
@RestController
@Slf4j
public class UserController extends BaseController {

    @Autowired UserDAO userDAO;
    @GetMapping(value = "/hello")
    public CommonResult get(){
        List<User> users = userDAO.selectByExample(new UserExample());
        return success(users.get(1));
    }

}
