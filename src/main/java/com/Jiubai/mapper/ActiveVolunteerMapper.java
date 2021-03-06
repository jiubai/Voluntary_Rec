package com.Jiubai.mapper;

import com.Jiubai.pojo.entity.ActiveVolunteer;
import com.Jiubai.pojo.entity.ActiveVolunteerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActiveVolunteerMapper {
    long countByExample(ActiveVolunteerExample example);

    int deleteByExample(ActiveVolunteerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActiveVolunteer record);

    int insertSelective(ActiveVolunteer record);

    List<ActiveVolunteer> selectByExample(ActiveVolunteerExample example);

    ActiveVolunteer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActiveVolunteer record, @Param("example") ActiveVolunteerExample example);

    int updateByExample(@Param("record") ActiveVolunteer record, @Param("example") ActiveVolunteerExample example);

    int updateByPrimaryKeySelective(ActiveVolunteer record);

    int updateByPrimaryKey(ActiveVolunteer record);
}