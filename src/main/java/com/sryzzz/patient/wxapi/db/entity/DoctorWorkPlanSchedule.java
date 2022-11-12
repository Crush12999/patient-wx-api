package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;

/**
 * @author sryzzz
 */
@Data
public class DoctorWorkPlanSchedule {
    private Integer id;
    private Integer workPlanId;
    private Byte slot;
    private Short maximum;
    private Short num;

}