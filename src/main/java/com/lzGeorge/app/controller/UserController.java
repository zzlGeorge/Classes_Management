package com.lzGeorge.app.controller;

import com.lzGeorge.app.dao.entity.StayInSchool;
import com.lzGeorge.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
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
    @RequestMapping("/test")
    public Map<String, String> getMsg() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "hello");
        return map;
    }

}
