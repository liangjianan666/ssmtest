package com.lja.service.Impl;

import com.lja.domain.User;
import com.lja.mapper.UserMapper;
import com.lja.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 包名称： com.lja.service.Impl
 * 类名称：UserServiceImpl
 * 类描述：TODO
 * 创建人：@author LiangJianAn
 * 创建时间：2020/3/25 10:25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(User user) {
        boolean flag = false;
        Integer i = userMapper.checkUsr(user);
        if(i > 0 ) {
            flag = true;
        }

        return flag;
    }

    @Override
    public boolean updatePassword(User user) {
        boolean flag = false;
        Integer i = userMapper.updatePassword(user);
        if(i > 0 ) {
            flag = true;
        }
        return flag;
    }
}
