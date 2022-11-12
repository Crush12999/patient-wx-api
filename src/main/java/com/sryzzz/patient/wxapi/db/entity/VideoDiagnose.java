package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author sryzzz
 */
@Data
public class VideoDiagnose {
    private Integer id;
    private Integer patientCardId;
    private Integer doctorId;
    private String outTradeNo;
    private BigDecimal amount;
    private Byte paymentStatus;
    private String prepayId;
    private String transactionId;
    private String expectStart;
    private String expectEnd;
    private String realStart;
    private String realEnd;
    private Byte status;
    private String createTime;

}