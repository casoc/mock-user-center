/**
 * BrandBigData.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */
package com.higgs.mockusercenter.dao;

import com.higgs.mockusercenter.domain.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author chenshiwei
 * @version $Id: UserDAO.java, v 0.1 2017/11/22 15:52 chenshiwei Exp $
 */
public interface UserDAO extends JpaRepository<UserDO, Integer> {

    @Modifying
    @Query("update UserDO ud set ud.frozenAmount = ud.frozenAmount + :amount where ud.id = :userId")
    void tryIncreaseAmount(@Param("userId") Integer userId, @Param("amount") Long amount);

    @Modifying
    @Query("update UserDO ud set ud.frozenAmount = ud.frozenAmount - :amount, ud.amount = ud.amount + :amount where ud.id = :userId")
    void confirmIncreaseAmount(@Param("userId") Integer userId, @Param("amount") Long amount);

    @Modifying
    @Query("update UserDO ud set ud.frozenAmount = ud.frozenAmount - :amount where ud.id = :userId")
    void cancelIncreaseAmount(@Param("userId") Integer userId, @Param("amount") Long amount);

}
