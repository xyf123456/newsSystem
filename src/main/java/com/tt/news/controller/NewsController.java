package com.tt.news.controller;

import com.tt.news.pojo.News;
import com.tt.news.pojo.NewsExample;
import com.tt.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: com.tt.news.controller.NewsController
 * @Description: 新闻控制器
 * @Author: Administrator
 * @CreateDate: 2018/11/29 16:52
 * @UpdateUser: Administrator
 * @Version: 1.0
 **/
//@RestController
@Controller
@RequestMapping("news")
public class NewsController {

    @Autowired
    private NewsService newsService;


    /**
     * @ Description:获取国内新闻（同时按创建时间进行降序）
     * @params: * @Param:
     * @return:java.lang.Object
     **/
    @RequestMapping("/getInNews")
    @ResponseBody
    public Object findInNews() throws Exception {

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
        return inNewsList;
    }

    /**
     * @ Description:获取国外新闻（同时按创建时间进行降序）
     * @params: * @Param:
     * @return:java.lang.Object
     **/
    @RequestMapping("/getOutNews")
    @ResponseBody
    public Object findOutNews() throws Exception {

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
        return outNewsList;
    }

    /**
     * @ Description:获取娱乐新闻（同时按创建时间进行降序）
     * @params: * @Param:
     * @return:java.lang.Object
     **/
    @RequestMapping("/getEnterNews")
    @ResponseBody
    public Object findEnterNews() throws Exception {

        NewsExample example3 = new NewsExample();
        NewsExample.Criteria criteria3 = example3.createCriteria();
        criteria3.andNidLessThan(60);
        List<Integer> values3 = new ArrayList<>();
        values3.add(5);//娱乐新闻
        criteria3.andNtidIn(values3);
        example3.setOrderByClause("ncreateDate DESC");
        //调用加载娱乐新闻业务
        List<News> enterNewsList = newsService.findNewsByExample(example3);
//        List<News> enterNewsList= newsService.findNewsByTopicName("娱乐");
        return enterNewsList;
    }

    /**
     * @ Description:获取2010-10-01 16:17:32以后的所有新闻（同时按创建时间进行降序）
     * @params: * @Param:
     * @return:java.lang.Object
     **/
    @RequestMapping("/getAllNews")
    @ResponseBody
    public Object findAllNews() throws Exception {
        NewsExample example4 = new NewsExample();
        NewsExample.Criteria criteria4 = example4.createCriteria();
        criteria4.andNcreatedateGreaterThanOrEqualTo(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2010-10-01 16:17:32"));
        example4.setOrderByClause("ncreateDate DESC");
        //调用加载新闻业务
        List<News> allNewsList = newsService.findNewsByExample(example4);
        return allNewsList;
    }

    @RequestMapping("/addNews")
    public String newsAddHtml(){
        return "newspages/news_add";
    }

    @RequestMapping("/modifyNews")
    public String newsModifyHtml(){
        return "newspages/news_modify";
    }

    @RequestMapping("/newsList")
    public String newsListHtml() {
        return "newspages/newsList";
    }

}
