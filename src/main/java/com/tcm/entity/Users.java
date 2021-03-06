package com.tcm.entity;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Users {

    private String userId;
    private String userName;
    private Date lastLoginDate;

}
