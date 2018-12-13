package com.tt.news.service.impl;

import com.tt.news.dao.NewsMapper;
import com.tt.news.pojo.News;
import com.tt.news.pojo.NewsExample;
import com.tt.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: com.tt.news.service.impl.NewsServiceImpl
 * @Description:  新闻业务接口实现类
 * @Author:      Administrator
 * @CreateDate: 2018/11/29 11:30
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
@Service
@Transactional
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsMapper newsMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<News> findNewsByTopicName(String tName) throws Exception {
        return newsMapper.selectByTopicName(tName);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<News> findNewsByExample(NewsExample example) throws Exception {
        return newsMapper.selectByExample(example);
    }
}
