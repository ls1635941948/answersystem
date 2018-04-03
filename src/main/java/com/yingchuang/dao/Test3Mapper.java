package com.yingchuang.dao;

import com.yingchuang.entity.Test3;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 朱博文 on 2018/4/3.
 */
public interface Test3Mapper {
    Integer addTest3(Test3 test3);
    Integer updateStatus(@Param("adminid") int adminid, @Param("status")int status);
    Integer updatePower(@Param("adminid") int adminid, @Param("power") int power);
}
