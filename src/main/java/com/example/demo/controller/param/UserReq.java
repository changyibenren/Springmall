package com.example.demo.controller.param;

import lombok.Data;

@Data
public class UserReq {
    private String userName;
    private String userPwd;
    private Integer rank; //用户等级
}
