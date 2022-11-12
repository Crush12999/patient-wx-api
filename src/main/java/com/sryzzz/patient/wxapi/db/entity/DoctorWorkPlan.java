package com.sryzzz.patient.wxapi.db.entity;

import java.util.Date;

import lombok.Data;

/**
 * @author sryzzz
 */
@Data
public class DoctorWorkPlan {
    private Integer id;
    private Integer doctorId;
    private Integer deptSubId;
    private Date date;
    private Short maximum;
    private Short num;

}