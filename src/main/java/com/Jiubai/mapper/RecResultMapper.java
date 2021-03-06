package com.Jiubai.mapper;

import com.Jiubai.pojo.entity.RecResult;
import com.Jiubai.pojo.entity.RecResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecResultMapper {
    long countByExample(RecResultExample example);

    int deleteByExample(RecResultExample example);

    int deleteByPrimaryKey(Integer volId);

    int insert(RecResult record);

    int insertSelective(RecResult record);

    List<RecResult> selectByExample(RecResultExample example);

    RecResult selectByPrimaryKey(Integer volId);

    int updateByExampleSelective(@Param("record") RecResult record, @Param("example") RecResultExample example);

    int updateByExample(@Param("record") RecResult record, @Param("example") RecResultExample example);

    int updateByPrimaryKeySelective(RecResult record);

    int updateByPrimaryKey(RecResult record);
}