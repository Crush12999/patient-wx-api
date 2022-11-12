package com.sryzzz.patient.wxapi.db.entity;

import lombok.Data;

/**
 * @author sryzzz
 */
@Data
public class VideoDiagnoseFile {
    private Integer id;
    private Integer videoDiagnoseId;
    private String filename;
    private String path;
    private String createTime;
}