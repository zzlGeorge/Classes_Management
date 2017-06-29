package com.lzGeorge.app.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lzGeorge.app.dao.entity.StayInSchool;
import com.lzGeorge.app.service.ActivityService;
import com.lzGeorge.app.utils.BackMessage;
import com.lzGeorge.app.utils.DefaultExportExl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

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
    public String insertMsg(StayInSchool stayInSchool, Model model) {
        int flag = activityService.addMessages(stayInSchool);
        if (flag > 0)
            model.addAttribute("flag", "插入数据成功！");
        else
            model.addAttribute("flag", "插入数据失败！");
        return "insert";
    }

    @ResponseBody
    @RequestMapping("/exportExl")
    public BackMessage getMsg(HttpServletRequest request) {
        List<StayInSchool> stayInSchools = activityService.getActivityInfos();

        String[] header = {"ID", "学院", "姓名", "性别", "学号", "班级", "地址", "电话", "时间", "原因", "老师", "联系方式", "记录时间"};
        JSONArray array = new JSONArray();
        array.addAll(stayInSchools);

        //data 数据遍历还是乱序！
        try {
            FileOutputStream fos = new FileOutputStream(new File("D://ss.xls"));
            DefaultExportExl.export("aa", header, array, fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return BackMessage.successData("A", "aa", "sadgsegs");
    }
}
