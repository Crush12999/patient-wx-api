package com.sryzzz.patient.wxapi.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sryzzz.patient.wxapi.db.entity.DoctorWorkPlanSchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * DoctorWorkPlanScheduleMapper
 *
 * @author sryzzz
 * @create 2022/11/12 21:20
 * @description DoctorWorkPlanScheduleMapper
 */
public interface DoctorWorkPlanScheduleMapper extends BaseMapper<DoctorWorkPlanSchedule> {

    public ArrayList<HashMap> searchDoctorWorkPlanSchedule(Map param);

    public ArrayList<HashMap> searchEligibleSchedule(Map param);

    public int updateNumById(Map param);

    public int releaseNumByOutTradeNo(String outTradeNo);
}




