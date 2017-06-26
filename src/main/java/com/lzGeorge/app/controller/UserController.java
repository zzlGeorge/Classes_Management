package com.lzGeorge.app.controller;

import com.lzGeorge.app.dao.entity.StudentInfo;
import com.lzGeorge.app.service.UserService;
import com.lzGeorge.app.utils.BackMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/6/16.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public BackMessage login(Integer sno, String longTel, HttpSession session) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        //检查已登录后不用重复登陆
        if (session.getAttribute("loginUser") != null) {
            return BackMessage.error("该用户已登录！");
        }

        if (sno == null || longTel.equals("") || longTel == null) {
            return BackMessage.error("输入项有误！");
        } else {
            StudentInfo studentInfo = userService.login(sno, longTel);
            if (studentInfo != null) {
                session.setAttribute("loginUser", studentInfo);
                return BackMessage.success("用户成功登陆！");
            } else {
                return BackMessage.error("该用户不存在！");
            }
        }

    }

    @ResponseBody
    @RequestMapping("/loginUser")
    public BackMessage loginUser(HttpSession session) {
        StudentInfo studentInfo = (StudentInfo) session.getAttribute("loginUser");
        if (studentInfo != null)
            return BackMessage.successData("用户状态已登录！", "loginUser", studentInfo);
        else return BackMessage.error("没有登陆用户！");
    }

}
