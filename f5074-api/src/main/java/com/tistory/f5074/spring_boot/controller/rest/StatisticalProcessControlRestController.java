package com.tistory.f5074.spring_boot.controller.rest;

import com.tistory.f5074.spring_boot.common.model.ApiResponse;
import com.tistory.f5074.spring_boot.common.utils.CommonUtils;
import com.tistory.f5074.spring_boot.mapper.EquipmentMapper;
import com.tistory.f5074.spring_boot.mapper.StatisticalProcessControlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = {"/equipment"})
public class StatisticalProcessControlRestController {
    @Autowired
    private StatisticalProcessControlMapper mapper;

    /**
     * SPC_CHART_HISTOGRAM_SELECT
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/SPC_CHART_HISTOGRAM_SELECT"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpMst(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.SPC_CHART_HISTOGRAM_SELECT(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * SPC_CHART_PROCESS_SELECT
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/SPC_CHART_PROCESS_SELECT"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> SPC_CHART_PROCESS_SELECT(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.SPC_CHART_PROCESS_SELECT(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * SPC_CHART_ITEM_SELECT
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/SPC_CHART_ITEM_SELECT"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> SPC_CHART_ITEM_SELECT(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.SPC_CHART_ITEM_SELECT(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }
}
