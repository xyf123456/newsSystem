package com.tt.news.pojo;

import java.io.Serializable;
/**
 * @ClassName: com.tt.news.pojo.Topic
 * @Description:  主题实体类
 * @Author:      Administrator
 * @CreateDate: 2018/11/29 11:23
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
public class Topic implements Serializable {
    private static final long serialVersionUID = 3624814238949315222L;
    private Integer tid;

    private String tname;

    public Topic() {
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }
}