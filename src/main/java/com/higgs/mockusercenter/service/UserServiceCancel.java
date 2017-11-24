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
 * @version $Id: UserServiceCancel.java, v 0.1 2017/11/22 16:55 chenshiwei Exp $
 */
@Service("userServiceCancel")
public class UserServiceCancel implements UserService {

    private final Logger logger = LoggerFactory.getLogger(UserServiceCancel.class);

    @Autowired
    private UserDOMapper userDOMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void increaseAmount(Integer userId, Long amount) {
        logger.error("cancel increase amount userId:{}, amount:{}", userId, amount);
        userDOMapper.cancelIncreaseAmount(userId, amount);
    }
}
