package com.tt.news.service.impl;

import com.tt.news.dao.UserMapper;
import com.tt.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: com.tt.news.service.impl.UserServiceImpl
 * @Description:  用户业务接口实现类
 * @Author:      Administrator
 * @CreateDate: 2018/11/30 9:19
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean login(String name, String pwd) {
        boolean flag = false;
        if (userMapper.selectByNameAndPwd(name,pwd)!=null){
            flag = true;
        }
        return flag;
    }
}
