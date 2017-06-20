package com.lzGeorge.app.service;

import com.lzGeorge.app.dao.entity.StayInSchool;

import java.util.List;

public interface ActivityService {
    List<StayInSchool> getActivityInfos();
    int addMessages(StayInSchool stayInSchool);
}
