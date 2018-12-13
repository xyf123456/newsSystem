package com.tt.news.pojo;

import java.io.Serializable;
/**
 * @ClassName: com.tt.news.pojo.User
 * @Description:  用户实体类
 * @Author:      Administrator
 * @CreateDate: 2018/11/29 11:23
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
public class User implements Serializable {
    private static final long serialVersionUID = -3213021141552902312L;
    private Integer uid;

    private String uname;

    private String upwd;

    public User() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }
}