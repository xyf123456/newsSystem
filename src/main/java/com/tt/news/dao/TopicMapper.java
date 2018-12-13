package com.tt.news.dao;

import com.tt.news.pojo.Topic;
import com.tt.news.pojo.TopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicMapper {
    int countByExample(TopicExample example);

    int deleteByExample(TopicExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Topic record);

   /* insertSelective对应的sql语句加入了NULL校验，即只会插入数据不为null的字段值。
    insert则会插入所有字段，会插入null。*/
    int insertSelective(Topic record);

    List<Topic> selectByExample(TopicExample example);

    Topic selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);
}