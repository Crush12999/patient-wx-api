package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;

/**
 * @author sryzzz
 */
@Data
public class User {
    private Integer id;
    private String openId;
    private String nickname;
    private String photo;
    private String sex;
    private byte status;
    private String createTime;
}
