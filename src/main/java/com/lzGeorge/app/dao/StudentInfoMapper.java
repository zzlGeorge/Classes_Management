package com.lzGeorge.app.dao;

import com.lzGeorge.app.dao.entity.StudentInfo;
import com.lzGeorge.app.dao.entity.StudentInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StudentInfoMapper {
    int countByExample(StudentInfoCriteria example);

    int deleteByExample(StudentInfoCriteria example);

    int deleteByPrimaryKey(Integer sno);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    List<StudentInfo> selectByExampleWithRowbounds(StudentInfoCriteria example, RowBounds rowBounds);

    List<StudentInfo> selectByExample(StudentInfoCriteria example);

    StudentInfo selectByPrimaryKey(Integer sno);

    int updateByExampleSelective(@Param("record") StudentInfo record, @Param("example") StudentInfoCriteria example);

    int updateByExample(@Param("record") StudentInfo record, @Param("example") StudentInfoCriteria example);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}