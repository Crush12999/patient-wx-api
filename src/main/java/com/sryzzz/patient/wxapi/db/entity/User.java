package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * <p>
 * 患者小程序账号
 * </p>
 *
 * @author sryzzz
 */
@Data
@ToString
public class User {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 唯一授权字符串
     */
    private String openId;

    /**
     * 微信昵称
     */
    private String nickname;

    /**
     * 微信头像
     */
    private String photo;

    /**
     * 性别
     */
    private String sex;

    /**
     * 状态：1代表正常，2代表禁用
     */
    private byte status;

    /**
     * 创建日期
     */
    private Date createTime;
}
