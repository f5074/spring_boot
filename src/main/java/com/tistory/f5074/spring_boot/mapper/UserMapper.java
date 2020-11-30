package com.tistory.f5074.spring_boot.mapper;


import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public int checkUserId(@Param("userId")String userId)throws Exception;
}
