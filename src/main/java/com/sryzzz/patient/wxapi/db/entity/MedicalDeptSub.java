package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;

/**
 * @author sryzzz
 */
@Data
public class MedicalDeptSub {
    private Integer id;
    private String name;
    private Integer deptId;
    private String location;
}