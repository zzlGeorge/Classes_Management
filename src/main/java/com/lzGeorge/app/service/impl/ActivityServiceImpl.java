package com.lzGeorge.app.service.impl;

import com.lzGeorge.app.dao.StayInSchoolMapper;
import com.lzGeorge.app.dao.entity.StayInSchool;
import com.lzGeorge.app.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/6/16.
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    StayInSchoolMapper mapper;

    public List<StayInSchool> getActivityInfos() {
        /*StayInSchoolCriteria criteria = new StayInSchoolCriteria();
        StayInSchoolCriteria.Criteria criteria1 = criteria.createCriteria();
        criteria1.andSexEqualTo("女");*/
        List<StayInSchool> stayInSchools = mapper.selectByExample(null);
        return stayInSchools;
    }
}
