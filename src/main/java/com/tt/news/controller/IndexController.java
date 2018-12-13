package com.tt.news.controller;

import com.tt.news.pojo.*;
import com.tt.news.service.NewsService;
import com.tt.news.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: com.tt.news.controller.IndexController
 * @Description: 首页控制器
 * @Author: Administrator
 * @CreateDate: 2018/11/29 10:16
 * @UpdateUser: Administrator
 * @Version: 1.0
 **/
@Controller
public class IndexController {

    @Autowired
    private NewsService newsService;

    @Autowired
    private TopicService topicService;


    @RequestMapping("/")
    public String index(Model model) throws Exception {

/*//        在iBator逆向工程生成的文件XxxExample.java中包含一个static的内部类Criteria，
//          Criteria中的方法是定义SQL 语句where后的查询条件。
        NewsExample example1 = new NewsExample();
        NewsExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andNidLessThan(50);
        List<Integer> values1 = new ArrayList<>();
        values1.add(1);//国内新闻
        criteria1.andNtidIn(values1);
        example1.setOrderByClause("ncreateDate DESC");
        //调用加载国内新闻业务
//        List<News> inNewsList= newsService.findNewsByTopicName("国内");
        List<News> inNewsList = newsService.findNewsByExample(example1);


        NewsExample example2 = new NewsExample();
        NewsExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andNidLessThan(60);
        List<Integer> values2 = new ArrayList<>();
        values2.add(2);//国际新闻
        criteria2.andNtidIn(values2);
        example2.setOrderByClause("ncreateDate DESC");
        //调用加载国际新闻业务
//        List<News> outNewsList= newsService.findNewsByTopicName("国际");
        List<News> outNewsList = newsService.findNewsByExample(example2);

        NewsExample example3 = new NewsExample();
        NewsExample.Criteria criteria3 = example3.createCriteria();
        criteria3.andNidLessThan(60);
        List<Integer> values3 = new ArrayList<>();
        values3.add(5);//娱乐新闻
        criteria3.andNtidIn(values3);
        example3.setOrderByClause("ncreateDate DESC");
        //调用加载娱乐新闻业务
        List<News> enterNewsList = newsService.findNewsByExample(example3);
//        List<News> enterNewsList= newsService.findNewsByTopicName("娱乐");*/

  /*  //调用主题业务得到所有主题
        TopicExample topicExample = new TopicExample();
        TopicExample.Criteria topicExampleCriteria = topicExample.createCriteria();
        topicExampleCriteria.andTnameIsNotNull();
        List<Topic> topicList = topicService.findTopics(topicExample);*/


        NewsExample example4 = new NewsExample();
        NewsExample.Criteria criteria4 = example4.createCriteria();
        criteria4.andNcreatedateGreaterThanOrEqualTo(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2010-10-01 16:17:32"));
        example4.setOrderByClause("ncreateDate DESC");
        //调用加载新闻业务
        List<News> allNewsList = newsService.findNewsByExample(example4);

//        model.addAttribute("inNewsList", inNewsList);
//        model.addAttribute("outNewsList", outNewsList);
//        model.addAttribute("enterNewsList", enterNewsList);
        model.addAttribute("allNewsList", allNewsList);
//        model.addAttribute("topicList", topicList);

        return "index";
    }
}
