package com.tistory.f5074.spring_boot.controller.rest;

import com.tistory.f5074.spring_boot.common.model.ApiResponse;
import com.tistory.f5074.spring_boot.common.utils.CommonUtils;
import com.tistory.f5074.spring_boot.mapper.EquipmentMapper;
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
public class EquipmentRestController {
    @Autowired
    private EquipmentMapper mapper;

    /**
     * selectEqpMst
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_MST"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpMst(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpMst(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpMaxLoad
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_MAX_LOAD"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpMaxLoad(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpMaxLoad(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpCdSpec
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_CD_SPEC"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpCdSpec(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpCdSpec(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpSrcData
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_SRC_DATA"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpSrcData(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpSrcData(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpPartNumber
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_PART_NUMBER"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpPartNumber(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpPartNumber(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpDeptMst
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_DEPT_CD"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpDeptMst(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpDeptMst(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpWorkCenter
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_WORK_CENTER"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpWorkCenter(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpWorkCenter(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpPerfPop
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_PERF_POP"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpPerfPop(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpPerfPop(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpPerfCim
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_PERF_CIM"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpPerfCim(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpPerfCim(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpSetupPerf
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_SETUP_PERF"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpSetupPerf(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpSetupPerf(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }
    /**
     * selectEqpSetupPerfSum
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/EQP_SETUP_PERF_SUM"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> selectEqpSetupPerfSum(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpSetupPerfSum(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpMaxLoad
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/selectEqpMaxLoad"
            ,"/selectEqpMaxLoad/{EQP_ID}/{START_DT}/"
            ,"/selectEqpMaxLoad/{EQP_ID}/{START_DT}/{END_DT}"
            ,"/selectEqpMaxLoad/{EQP_ID}/{START_DT}/{END_DT}/{ITEM_CD}"}, method = RequestMethod.GET)
    public ApiResponse<List<Map<String,Object>>> selectEqpMaxLoad(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap, String sub) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        Map<String,Object> parameterMap = new HashMap<>();
        for (Object key :pathVariableMap.keySet()){
            if(key instanceof String) {
                Object value = pathVariableMap.get(key);
                parameterMap.put(key.toString(), value);
            }
        }
        List<Map<String,Object>>result = mapper.selectEqpMaxLoad(parameterMap);
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpMst
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/selectEqpMst"}, method = RequestMethod.GET)
    public ApiResponse<List<Map<String,Object>>> selectEqpMst(
            HttpServletRequest request, @PathVariable Map<String, Object> pathVariableMap, String sub) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpMst(pathVariableMap);
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpCdSpec
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/selectEqpCdSpec"
            ,"/selectEqpCdSpec/{EQP_ID}"}, method = RequestMethod.GET)
    public ApiResponse<List<Map<String,Object>>> selectEqpCdSpec(
            HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap, String sub) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        List<Map<String,Object>>result = mapper.selectEqpCdSpec(pathVariableMap);
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    /**
     * selectEqpSrcData
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/selectEqpSrcData"
            ,"/selectEqpSrcData/{EQP_ID}/{START_DT}"
            ,"/selectEqpSrcData/{EQP_ID}/{START_DT}/{END_DT}"
            ,"/selectEqpSrcData/{EQP_ID}/{START_DT}/{END_DT}/{ITEM_CD}"}, method = RequestMethod.GET)
    public ApiResponse<List<Map<String,Object>>> selectEqpSrcData(
            HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap, String sub) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        Map<String,Object> parameterMap = new HashMap<>();
        for (Object key :pathVariableMap.keySet()){
            if(key instanceof String) {
                if (!key.toString().equals("ITEM_CD")) {
                    String value = (String) pathVariableMap.get(key);
                    parameterMap.put("ITEM_CD", Arrays.asList(value.split(",")));
                } else {
                    Object value = pathVariableMap.get(key);
                    parameterMap.put(key.toString(), value);
                }
            }
        }
        List<Map<String,Object>>result = mapper.selectEqpSrcData(parameterMap);
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }
}
