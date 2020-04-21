package com.lja.mapper;

import com.lja.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 包名称： com.lja.mapper
 * 类名称：UserMapper.xml
 * 类描述：sutdentMapper
 * 创建人：@author LiangJianAn
 * 创建时间：2020/3/25 9:30
 */

public interface UserMapper {
    Integer checkUsr(@Param("user") User user);

    Integer updatePassword(User user);
}
