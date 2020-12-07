package com.tistory.f5074.spring_boot.mapper;


import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    public Map<String, Object> jsonObject(Map<String,Object> parameters)throws Exception;

    public List<Map<String, Object>> jsonList(Map<String,Object> parameters)throws Exception;
    public List<Map<String, Object>> selectUsers(Map<String,Object> parameters)throws Exception;
}


