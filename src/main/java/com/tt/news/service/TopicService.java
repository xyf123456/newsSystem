package com.tt.news.service;

import com.tt.news.pojo.Topic;
import com.tt.news.pojo.TopicExample;

import java.util.List;

/**
 * @ClassName: com.tt.news.service.TopicService
 * @Description:  主题业务接口
 * @Author:      Administrator
 * @CreateDate: 2018/11/29 15:55
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
public interface TopicService {

    List<Topic> findTopics(TopicExample topicExample);

    void addTopic(Topic topic);

    Topic findTopicByTid(Integer tid);

    boolean updateTopicByTid(Topic topic);
}
