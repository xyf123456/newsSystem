package com.tt.news.controller;

import com.tt.news.pojo.Topic;
import com.tt.news.pojo.TopicExample;
import com.tt.news.service.TopicService;
import org.apache.catalina.startup.Tomcat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: com.tt.news.controller.TopicController
 * @Description: 主题控制器
 * @Author: Administrator
 * @CreateDate: 2018/11/29 17:13
 * @UpdateUser: Administrator
 * @Version: 1.0
 **/
//@RestController
@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/getTopics")
    @ResponseBody
    public Object getTopics() {
        //调用主题业务得到所有主题
        TopicExample topicExample = new TopicExample();
        TopicExample.Criteria topicExampleCriteria = topicExample.createCriteria();
        topicExampleCriteria.andTnameIsNotNull();
        List<Topic> topicList = topicService.findTopics(topicExample);
        return topicList;
    }

    @RequestMapping("/addTopic")
    public String topicAddHtml() {
        return "newspages/topic_add";
    }

    @RequestMapping("/doAddTopic")
    public String doAddTopic(@RequestParam("tname") String tName) {
        Topic topic = new Topic();
        topic.setTname(tName);
        if (tName != null) {
            topicService.addTopic(topic);
        }
        return "redirect:/admin/";
    }

    @RequestMapping("/modifyTopic/{tid}")
    public String topicModifyHtml(@PathVariable("tid") String tid, HttpServletRequest request) {
        Topic top = topicService.findTopicByTid(Integer.valueOf(tid));
        request.getSession().setAttribute("top", top);
        return "newspages/topic_modify";
    }

    @RequestMapping(value = "/doUpdateTopic", method = RequestMethod.POST)
    public String doUpdateTopic(@RequestParam("tid") String tid, @RequestParam("tname") String tname, HttpServletRequest request) {
        Topic topic = new Topic();
        topic.setTid(Integer.valueOf(tid));
        topic.setTname(tname);
        if (topicService.updateTopicByTid(topic)){
            return "redirect:/admin/";
        }
        return "redirect:/admin/";
    }



    @RequestMapping("/topicList")
    public String topicListHtml() {
        return "newspages/topic_list";
    }
}
