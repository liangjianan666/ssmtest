package com.lja.domain;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 包名称： com.lja.domain
 * 类名称：User
 * 类描述：TODO
 * 创建人：@author LiangJianAn
 * 创建时间：2020/3/25 10:27
 */

public class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


//    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("2", "2");
//        map.put("5", "5");
//        map.put("9", "9");
//        map.put("11", "11");
//        map.put("1", "1");
//
//        Map<Integer, String> map1 = map.entrySet().stream().collect(Collectors.toMap(e -> Integer.valueOf(e.getKey()), Map.Entry::getValue));
//
//        map1.entrySet().stream().forEach(t -> {
//            System.out.println(t.getKey());
//            System.out.println(t.getValue());
//            System.out.println("=====");
//        });
//
//    }
}
