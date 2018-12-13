package com.tt.news.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * @ClassName: com.tt.news.pojo.News
 * @Description:  新闻实体类
 * @Author:      Administrator
 * @CreateDate: 2018/11/29 11:22
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
public class News implements Serializable {
    private static final long serialVersionUID = 7077446420141718490L;
    private Integer nid;

    private Integer ntid;

    private String ntitle;

    private String nauthor;

    private Date ncreatedate;

    private String npicpath;

    private Date nmodifydate;

    private String nsummary;

    private String ncontent;

    public News() {
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getNtid() {
        return ntid;
    }

    public void setNtid(Integer ntid) {
        this.ntid = ntid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle == null ? null : ntitle.trim();
    }

    public String getNauthor() {
        return nauthor;
    }

    public void setNauthor(String nauthor) {
        this.nauthor = nauthor == null ? null : nauthor.trim();
    }

    public Date getNcreatedate() {
        return ncreatedate;
    }

    public void setNcreatedate(Date ncreatedate) {
        this.ncreatedate = ncreatedate;
    }

    public String getNpicpath() {
        return npicpath;
    }

    public void setNpicpath(String npicpath) {
        this.npicpath = npicpath == null ? null : npicpath.trim();
    }

    public Date getNmodifydate() {
        return nmodifydate;
    }

    public void setNmodifydate(Date nmodifydate) {
        this.nmodifydate = nmodifydate;
    }

    public String getNsummary() {
        return nsummary;
    }

    public void setNsummary(String nsummary) {
        this.nsummary = nsummary == null ? null : nsummary.trim();
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent == null ? null : ncontent.trim();
    }
}