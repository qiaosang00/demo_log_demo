package com.example.demo_log_demo.bean;

public class userbean {

//    private int id;
    private String username;
    private String password;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
//                "id=" + id +
                ", userName='" + username + '\'' +
                ", passWord='" + password + '\'' +
                '}';
    }

}
