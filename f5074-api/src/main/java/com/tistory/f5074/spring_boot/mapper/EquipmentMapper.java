package com.tistory.f5074.spring_boot.mapper;


import java.util.List;
import java.util.Map;

public interface EquipmentMapper {
    List<Map<String, Object>> selectEqpMst(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpMaxLoad(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpCdSpec(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpSrcData(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpPartNumber(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpDeptMst(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpWorkCenter(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpPerfPop(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpPerfCim(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpSetupPerf(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> selectEqpSetupPerfSum(Map<String,Object> parameters)throws Exception;
}


