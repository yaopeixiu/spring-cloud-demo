package com.example.springclouduser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springclouduser.dao.UserMapper;
import com.example.springclouduser.entity.User;
import com.example.springclouduser.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author system
 * @since 2020-11-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
