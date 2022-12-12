package com.sryzzz.patient.wxapi.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sryzzz.patient.wxapi.db.entity.UserInfoCard;

/**
 * UserInfoCardDao
 *
 * @author sryzzz
 * @create 2022/11/12 21:20
 * @description UserInfoCardDao
 */
public interface UserInfoCardDao extends BaseMapper<UserInfoCard> {

    /**
     * 通过 userId 查询患者手机号
     *
     * @param userId 患者标识id
     * @return 手机号
     */
    String searchUserTel(int userId);
}
