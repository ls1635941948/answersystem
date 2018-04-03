package com.yingchuang.dao;

import com.yingchuang.entity.Test1;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 朱博文 on 2018/4/3.
 */
public interface Test1Mapper {
       Integer addTest1(Test1 test1);
       Integer updateStatus(@Param("adminid") int adminid,@Param("status")int status);
       Integer updatePower(@Param("adminid") int adminid,@Param("power") int power);
}
