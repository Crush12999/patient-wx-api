package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sryzzz
 */
@Data
public class Doctor implements Serializable {
    private Integer id;
    private String name;
    private String pid;
    private String uuid;
    private String sex;
    private String photo;
    private String birthday;
    private String school;
    private String degree;
    private String tel;
    private String address;
    private String email;
    private String job;
    private String remark;
    private String description;
    private String hiredate;
    private String tag;
    private Boolean recommended;
    private String createTime;
}