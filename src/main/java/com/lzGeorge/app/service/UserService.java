package com.lzGeorge.app.service;

import com.lzGeorge.app.dao.entity.StudentInfo;

public interface UserService {
    StudentInfo login(Integer sno, String longTel);
}
