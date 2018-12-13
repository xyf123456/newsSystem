package com.tt.news.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * @ClassName: com.tt.news.pojo.Comment
 * @Description:  评论实体类
 * @Author:      Administrator
 * @CreateDate: 2018/11/29 11:21
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
public class Comment implements Serializable {
    private static final long serialVersionUID = 8211837200311868117L;
    private Integer cid;

    private Integer cnid;

    private String ccontent;

    private Date cdate;

    private String cip;

    private String cauthor;

    public Comment() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCnid() {
        return cnid;
    }

    public void setCnid(Integer cnid) {
        this.cnid = cnid;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent == null ? null : ccontent.trim();
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip == null ? null : cip.trim();
    }

    public String getCauthor() {
        return cauthor;
    }

    public void setCauthor(String cauthor) {
        this.cauthor = cauthor == null ? null : cauthor.trim();
    }
}