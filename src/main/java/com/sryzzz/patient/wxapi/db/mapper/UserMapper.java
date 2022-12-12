package com.sryzzz.patient.wxapi.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sryzzz.patient.wxapi.db.entity.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserMapper
 *
 * @author sryzzz
 * @create 2022/11/12 21:20
 * @description UserMapper
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 添加患者
     *
     * @param entity 患者信息
     * @return 受影响的行数
     */
    @Transactional(rollbackFor = Exception.class)
    int insertUser(User entity);

    /**
     * 查询患者是否注册过
     *
     * @param openId openId
     * @return 查询到的记录数
     */
    Integer searchAlreadyRegistered(String openId);
}
