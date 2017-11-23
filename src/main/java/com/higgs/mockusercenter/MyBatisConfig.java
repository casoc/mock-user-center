/**
 * BrandBigData.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */
package com.higgs.mockusercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenshiwei
 * @version $Id: MyBatisConfig.java, v 0.1 2017/11/23 16:15 chenshiwei Exp $
 */
@Configuration
@MapperScan("com.higgs.mockusercenter.dao")
public class MyBatisConfig {
}
