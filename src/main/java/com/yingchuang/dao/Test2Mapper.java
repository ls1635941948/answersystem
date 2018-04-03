package com.yingchuang.dao;

import com.yingchuang.entity.Test2;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 朱博文 on 2018/4/3.
 */
public interface Test2Mapper {
    Integer addTest2(Test2 test2);
    Integer updateStatus(@Param("adminid") int adminid,@Param("status")int status);
    Integer updatePower(@Param("adminid") int adminid, @Param("power") int power);
}
