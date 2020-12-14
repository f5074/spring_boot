package com.tistory.f5074.spring_boot.controller;

import com.tistory.f5074.spring_boot.common.ApiResponse;
import com.tistory.f5074.spring_boot.mapper.EquipmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = {"/equipment"})
public class EquipmentRestController {
    @Autowired
    private EquipmentMapper mapper;

    @RequestMapping(value = {"/selectEqpMaxLoad"
                            ,"/selectEqpMaxLoad/{EQP_ID}/{START_DT}/"
                            ,"/selectEqpMaxLoad/{EQP_ID}/{START_DT}/{END_DT}"
                            ,"/selectEqpMaxLoad/{EQP_ID}/{START_DT}/{END_DT}/{ITEM_CD}"}, method = RequestMethod.GET)
    public ApiResponse<List<Map<String,Object>>> selectEqpMaxLoad(HttpServletRequest request
        , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        Map<String,Object> parameterMap = new HashMap<>();
        for (Object key :pathVariableMap.keySet()){
            Object value = pathVariableMap.get(key);
            parameterMap.put(key.toString(), value);
        }
        List<Map<String,Object>>result = mapper.selectEqpMaxLoad(parameterMap);
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    @RequestMapping(value = {"/selectEqpMst"}, method = RequestMethod.GET)
    public ApiResponse<List<Map<String,Object>>> selectEqpMst(
              HttpServletRequest request, @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpMst(pathVariableMap);
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    @RequestMapping(value = {"/selectEqpCdSpec"}, method = RequestMethod.GET)
    public ApiResponse<List<Map<String,Object>>> selectEqpCdSpec(
            HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpCdSpec(pathVariableMap);
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }
}
