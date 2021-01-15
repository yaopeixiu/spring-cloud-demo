package com.example.springclouduser.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springclouduser.service.UserService;
import com.example.springclouduser.utils.PageUtils;
import com.example.springclouduser.vo.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/userList")
    public ApiResult list(){
//        查询第一页，每页返回五条
//        Page<User> page = new Page<>(1,5);
//        QueryWrapper构造器
        IPage iPage = userService.page(new Page<>(), new QueryWrapper());

        return ApiResult.success(new PageUtils(iPage));
    }

    @GetMapping("/users")
    public ApiResult users(){
//        查询第一页，每页返回五条
//        Page<User> page = new Page<>(1,5);
//        QueryWrapper构造器
        IPage iPage = userService.page(new Page<>(), new QueryWrapper());

        return ApiResult.success(new PageUtils(iPage));
    }
}
