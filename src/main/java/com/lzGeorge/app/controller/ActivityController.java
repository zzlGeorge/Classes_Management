package com.lzGeorge.app.controller;

import com.lzGeorge.app.dao.entity.StayInSchool;
import com.lzGeorge.app.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    ActivityService activityService;

    @ResponseBody
    @RequestMapping("/getInfos")
    public List<StayInSchool> getActivityInfos() {
        List<StayInSchool> stayInSchools = activityService.getActivityInfos();
        return stayInSchools;
    }

    @RequestMapping("/addmsg")
    public String insertMsg(StayInSchool stayInSchool, Model model, HttpServletRequest request) {
        int flag = activityService.addMessages(stayInSchool);
        if (flag > 0)
            model.addAttribute("flag", "插入数据成功！");
        else
            model.addAttribute("flag", "插入数据失败！");
        return "insert";
    }
}
