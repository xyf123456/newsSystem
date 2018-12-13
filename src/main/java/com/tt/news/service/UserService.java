package com.tt.news.service;
/**
 * @ClassName: com.tt.news.service.UserService
 * @Description:  用户业务接口
 * @Author:      Administrator
 * @CreateDate: 2018/11/30 9:18
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
public interface UserService {
    boolean login(String name, String pwd);
}
