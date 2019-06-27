package com.example.demo_log_demo.mapper;

import com.example.demo_log_demo.bean.userbean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface usermapper {
    List<userbean> selo(String username);
    userbean sel(int id);
    userbean sep(String username);
    boolean del(String username);
    int updateo(String username);
}
