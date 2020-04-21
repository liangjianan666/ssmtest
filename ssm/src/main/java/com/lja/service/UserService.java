package com.lja.service;

import com.lja.domain.User;

/**
 * 包名称： com.lja.service
 * 类名称：UserService
 * 类描述：TODO
 * 创建人：@author LiangJianAn
 * 创建时间：2020/3/25 10:25
 */
public interface UserService {
    boolean login(User user);

    boolean updatePassword(User name);
}
