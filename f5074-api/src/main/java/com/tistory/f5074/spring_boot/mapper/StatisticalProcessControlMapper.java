package com.tistory.f5074.spring_boot.mapper;


import java.util.List;
import java.util.Map;

public interface StatisticalProcessControlMapper {
    List<Map<String, Object>> SPC_CHART_HISTOGRAM_SELECT(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> SPC_CHART_PROCESS_SELECT(Map<String,Object> parameters)throws Exception;
    List<Map<String, Object>> SPC_CHART_ITEM_SELECT(Map<String,Object> parameters)throws Exception;
}


