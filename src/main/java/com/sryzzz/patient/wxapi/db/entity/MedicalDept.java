package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sryzzz
 */
@Data
public class MedicalDept implements Serializable {
    private Object id;
    private String name;
    private Boolean outpatient;
    private String description;
    private String location;
    private Boolean recommended;
}