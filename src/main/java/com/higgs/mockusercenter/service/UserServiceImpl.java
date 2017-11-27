/**
 * BrandBigData.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */
package com.higgs.mockusercenter.service;

import org.bytesoft.compensable.Compensable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.higgs.mockusercenter.dao.UserDOMapper;

/**
 * @author chenshiwei
 * @version $Id: UserServiceImpl.java, v 0.1 2017/11/22 15:55 chenshiwei Exp $
 */
@Service("userService")
@Compensable(interfaceClass = UserService.class, confirmableKey = "userServiceConfirm", cancellableKey = "userServiceCancel")
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDOMapper userDOMapper;
    //    @Autowired
    //    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public void increaseAmount(Integer userId, Long amount) {
        logger.error("try increase amount userId:{}, amount:{}", userId, amount);
        userDOMapper.tryIncreaseAmount(userId, amount);
        //        int value = this.jdbcTemplate.update("UPDATE users SET frozen_amount = frozen_amount + ? WHERE id = ?", amount, userId);
        //        throw new RuntimeException("ERROR");
    }
}
