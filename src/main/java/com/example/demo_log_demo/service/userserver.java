package com.example.demo_log_demo.service;

import com.example.demo_log_demo.bean.userbean;
import com.example.demo_log_demo.mapper.usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userserver {
    @Autowired
    usermapper usermapper;
    public userbean sel(int id){
        return usermapper.sel(id);
    }
    public userbean sep(String username){
        return usermapper.sep(username);
    }
    public boolean del(String username){
        return usermapper.del(username);
    }
    public List<userbean> selo(String username){
        return usermapper.selo(username);
    }
    public int updateo(String username){
        return usermapper.updateo(username);
    }
}
