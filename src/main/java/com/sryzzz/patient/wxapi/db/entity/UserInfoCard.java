package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;

/**
 * @author sryzzz
 */
@Data
public class UserInfoCard {
    private Integer id;
    private Integer userId;
    private String uuid;
    private String name;
    private String sex;
    private String pid;
    private String tel;
    private String birthday;
    private String medicalHistory;
    private String insuranceType;
    private Boolean existFaceModel;
}
