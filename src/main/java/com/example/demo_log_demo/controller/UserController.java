package com.example.demo_log_demo.controller;

import com.example.demo_log_demo.bean.userbean;
import com.example.demo_log_demo.service.userserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testBoot")
@Configuration public class UserController {
//    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    userserver userserver;


    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
//        LOG.info("---------打印日志----------");
        return userserver.sel(id).toString();
    }

    @RequestMapping("getusername/{username}")
    public String getusername(@PathVariable String username){
        return userserver.sep(username).toString();
    }

    @RequestMapping("deluser/{username}")
    public String deluser(@PathVariable String username){
        if(userserver.del(username)==true){
            return "删除成功";
        }
        return "删除失败";
    }
    @RequestMapping("sel/{username}")
    public List<userbean> selo(@PathVariable String username){
        return userserver.selo(username);
    }
    @RequestMapping("update/{username}")
    public int updateo(@PathVariable String username){
        return userserver.updateo(username);
    }
}
