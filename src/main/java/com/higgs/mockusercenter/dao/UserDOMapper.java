package com.higgs.mockusercenter.dao;

import com.higgs.mockusercenter.domain.UserDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

public interface UserDOMapper extends Mapper<UserDO> {

    @Update("UPDATE users SET frozen_amount = frozen_amount + #{amount} WHERE id = #{userId}")
    void tryIncreaseAmount(@Param("userId") Integer userId, @Param("amount") Long amount);

    @Update("UPDATE users SET frozen_amount = frozen_amount - #{amount}, amount = amount + #{amount} WHERE id = #{userId}")
    void confirmIncreaseAmount(@Param("userId") Integer userId, @Param("amount") Long amount);

    @Update("UPDATE users SET frozen_amount = frozen_amount - #{amount} WHERE id = #{userId}")
    void cancelIncreaseAmount(@Param("userId") Integer userId, @Param("amount") Long amount);
}