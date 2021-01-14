package com.tistory.f5074.spring_boot.mapper;


import java.util.List;
import java.util.Map;

public interface EquipmentMapper {
    List<Map<String, Object>> selectEqpMst(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpMaxLoad(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpCdSpec(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpSrcData(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpPartNumber(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectDeptMst(Map<String,Object> parameters)throws Exception;

}


