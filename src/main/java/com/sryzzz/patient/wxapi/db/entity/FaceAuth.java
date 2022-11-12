package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;

/**
 * @author sryzzz
 */
@Data
public class FaceAuth {
    private Integer id;
    private Integer patientCardId;
    private String date;
}