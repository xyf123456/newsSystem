package com.tt.news.service.impl;

import com.tt.news.dao.TopicMapper;
import com.tt.news.pojo.Topic;
import com.tt.news.pojo.TopicExample;
import com.tt.news.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: com.tt.news.service.impl.TopicServiceImpl
 * @Description:  主题业务接口实现类
 * @Author:      Administrator
 * @CreateDate: 2018/11/29 15:55
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
@Service
@Transactional
public class TopicServiceImpl implements TopicService{

    @Autowired
    private TopicMapper topicMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Topic> findTopics(TopicExample topicExample) {
        return topicMapper.selectByExample(topicExample);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void addTopic(Topic topic) {
        topicMapper.insertSelective(topic);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Topic findTopicByTid(Integer tid) {
        return topicMapper.selectByPrimaryKey(tid);
    }
}
