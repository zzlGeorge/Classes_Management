package com.lzGeorge.app.dao;

import com.lzGeorge.app.dao.entity.StayInSchool;
import com.lzGeorge.app.dao.entity.StayInSchoolCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StayInSchoolMapper {
    int countByExample(StayInSchoolCriteria example);

    int deleteByExample(StayInSchoolCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(StayInSchool record);

    int insertSelective(StayInSchool record);

    List<StayInSchool> selectByExampleWithRowbounds(StayInSchoolCriteria example, RowBounds rowBounds);

    List<StayInSchool> selectByExample(StayInSchoolCriteria example);

    StayInSchool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StayInSchool record, @Param("example") StayInSchoolCriteria example);

    int updateByExample(@Param("record") StayInSchool record, @Param("example") StayInSchoolCriteria example);

    int updateByPrimaryKeySelective(StayInSchool record);

    int updateByPrimaryKey(StayInSchool record);

    List<StayInSchool> queryAll();
}