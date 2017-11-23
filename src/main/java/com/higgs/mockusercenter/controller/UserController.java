/**
 * BrandBigData.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */
package com.higgs.mockusercenter.controller;

import com.higgs.mockusercenter.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chenshiwei
 * @version $Id: UserController.java, v 0.1 2017/11/22 15:57 chenshiwei Exp $
 */
@RestController
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/user/increase/amount", method = RequestMethod.GET)
    public Boolean increaseAmount(@RequestParam("userId") Integer userId, @RequestParam("amount") Long amount) {
        try {
            userService.increaseAmount(userId, amount);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
