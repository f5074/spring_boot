package com.tistory.f5074.spring_boot.mapper;


import java.util.List;
import java.util.Map;

public interface CommonMapper {
    List<Map<String, Object>> selectCommonMasCd(Map<String,Object> parameters)throws Exception;
}


