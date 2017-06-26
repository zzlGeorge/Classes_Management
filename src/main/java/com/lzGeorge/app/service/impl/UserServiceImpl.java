package com.lzGeorge.app.service.impl;

import com.lzGeorge.app.dao.StudentInfoMapper;
import com.lzGeorge.app.dao.entity.StayInSchoolCriteria;
import com.lzGeorge.app.dao.entity.StudentInfo;
import com.lzGeorge.app.dao.entity.StudentInfoCriteria;
import com.lzGeorge.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    StudentInfoMapper mapper;

    public StudentInfo login(Integer sno, String longTel) {
        StudentInfoCriteria studentInfoCriteria = new StudentInfoCriteria();
        StudentInfoCriteria.Criteria criteria = studentInfoCriteria.createCriteria();
        criteria.andSnoEqualTo(sno).andTellEqualTo(longTel);
        List<StudentInfo> list = mapper.selectByExample(studentInfoCriteria);
        return list.size() > 0 ? list.get(0) : null;
    }
}
