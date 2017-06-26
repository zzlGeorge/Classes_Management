package com.lzGeorge.app.controller;

import com.lzGeorge.app.dao.entity.StayInSchool;
import com.lzGeorge.app.service.ActivityService;
import com.lzGeorge.app.utils.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
        try {
            ExportExcel<StayInSchool> ex = new ExportExcel<StayInSchool>();
            String[] header = {"ID", "学院", "姓名", "性别", "学号", "班级", "地址", "电话", "时间", "原因", "老师", "联系方式", "记录时间"};
            OutputStream outputStream = new FileOutputStream("D://aa.xls");
            ex.exportExcel(header, stayInSchools, outputStream);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
