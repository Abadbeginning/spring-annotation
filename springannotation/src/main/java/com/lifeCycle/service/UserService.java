package com.lifeCycle.service;

import com.lifeCycle.dao.UserDao;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@ToString
public class UserService {
    @Autowired
//    @Qualifier("userDao")
    private UserDao userDao;

    public void show(){
        System.out.println(userDao);
    }


}
