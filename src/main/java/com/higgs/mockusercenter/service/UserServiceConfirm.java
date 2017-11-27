/**
 * BrandBigData.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */
package com.higgs.mockusercenter.service;

import com.higgs.mockusercenter.dao.UserDOMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chenshiwei
 * @version $Id: UserServiceConfirm.java, v 0.1 2017/11/22 16:53 chenshiwei Exp $
 */
@Service("userServiceConfirm")
public class UserServiceConfirm implements UserService {

    private final Logger logger = LoggerFactory.getLogger(UserServiceConfirm.class);

    @Autowired
    private UserDOMapper userDOMapper;
//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public void increaseAmount(Integer userId, Long amount) {
        logger.error("confirm increase amount userId:{}, amount:{}", userId, amount);
        userDOMapper.confirmIncreaseAmount(userId, amount);
//        int value = this.jdbcTemplate.update("UPDATE users SET frozen_amount = frozen_amount - ?, amount = amount + ? WHERE id = ?", amount, amount, userId);
//        throw new RuntimeException("ERROR");
    }
}
