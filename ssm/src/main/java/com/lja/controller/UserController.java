package com.lja.controller;

import com.lja.domain.User;
import com.lja.service.UserService;
import com.lja.util.ResponseCode;
import com.sun.deploy.nativesandbox.comm.Response;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 包名称： com.lja.controller
 * 类名称：StudentController
 * 类描述：学生controller
 * 创建人：@author LiangJianAn
 * 创建时间：2020/3/24 17:55
 */
@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public boolean login(@RequestBody User user, HttpServletRequest request) {
        boolean flag = userService.login(user);

        //把名字放到session中
        if (flag) {
            HttpSession session = request.getSession();
            session.setAttribute("name", user.getName());
            session.setAttribute("password", user.getPassword());
        }

        return flag;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseCode login(@Param("oldPassword") String oldPassword, @Param("newPassword") String newPassword, @Param("checkNewPassword") String checkNewPassword, HttpServletRequest request) {

        String password = (String) request.getSession().getAttribute("password");
        if(!password.equals(oldPassword)) {
            return ResponseCode.build("1002","所填旧密码不对",null);
        }

        if(!newPassword.equals(checkNewPassword)) {
            return ResponseCode.build("1003","两次密码填写不一致",null);
        }

        boolean flag = userService.updatePassword(new User((String) request.getSession().getAttribute("name"), newPassword));

        if (!flag) {
            return ResponseCode.build("1004","操作数据库，修改密码失败",null);
        }

        HttpSession session = request.getSession();
        session.setAttribute("password", newPassword);
        return ResponseCode.build("1001","修改密码成功",null);
    }


//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    @ResponseBody
//    public String login() {
//        User user = new User();
//        user.setName("lja");
//        user.setPassword("lja");
//        boolean flag = userService.login(user);
//
//        if (flag) {
//            return "welcome";
//        }
//        return "error";
//    }
}
