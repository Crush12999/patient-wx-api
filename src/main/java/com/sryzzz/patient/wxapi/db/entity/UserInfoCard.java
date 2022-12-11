package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 患者信息卡
 *
 * @author sryzzz
 */
@Data
@ToString
public class UserInfoCard {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 患者ID
     */
    private Integer userId;

    /**
     * UUID，当做患者信息卡的编号
     */
    private String uuid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 身份证号
     */
    private String pid;

    /**
     * 手机号码
     */
    private String tel;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 疾病史，JSON 数组
     */
    private String medicalHistory;

    /**
     * 保险类型
     */
    private String insuranceType;

    /**
     * 是否录入面部信息
     */
    private Boolean existFaceModel;
}
