package com.hasaker.vblog.service.impl;

import com.hasaker.vblog.base.impl.BaseServiceImpl;
import com.hasaker.vblog.entity.User;
import com.hasaker.vblog.exception.enums.UserExceptionEnums;
import com.hasaker.vblog.mapper.UserMapper;
import com.hasaker.vblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @package com.hasaker.vblog.service.impl
 * @author 余天堂
 * @create 2020/1/2 17:21
 * @description UserServiceImpl
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 通过用户名获取用户
     * @param username
     * @return
     */
    @Override
    public User loadUserByUsername(String username) {
        User user = userMapper.loadUserByUsername(username);
        UserExceptionEnums.USER_NOT_EXISTS.assertNotNull(user);

        return user;
    }
}
