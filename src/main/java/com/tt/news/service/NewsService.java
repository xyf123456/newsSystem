package com.tt.news.service;

import com.tt.news.pojo.News;
import com.tt.news.pojo.NewsExample;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: com.tt.news.service.NewsService
 * @Description:  新闻业务接口
 * @Author:      Administrator
 * @CreateDate: 2018/11/29 11:27
 * @UpdateUser:   Administrator 
 * @Version:        1.0
 **/
public interface NewsService {

    /**
     * @ Description: 获取某主题的新闻信息
     * @params:  * @Param: nName
     * @return:java.util.List<com.tt.news.pojo.News>
     **/
    List<News> findNewsByTopicName(String tName) throws Exception;

    /**
     * @ Description:通过条件查询新闻列表
     * @params:  * @Param: example
     * @return:java.util.List<com.tt.news.pojo.News>
     **/
    List<News> findNewsByExample(NewsExample example) throws Exception;
}
