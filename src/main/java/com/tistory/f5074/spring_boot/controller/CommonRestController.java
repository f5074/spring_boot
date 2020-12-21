package com.tistory.f5074.spring_boot.controller;

import com.tistory.f5074.spring_boot.common.ApiResponse;
import com.tistory.f5074.spring_boot.common.utils.CommonUtils;
import com.tistory.f5074.spring_boot.mapper.CommonMapper;
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
public class CommonRestController {
    @Autowired
    private CommonMapper mapper;

    /**
     * MAS_CD_GENEDATA_SELECT_BY_CONDITION
     * @param request HttpServletRequest
     * @param pathVariableMap Map<String, Object>
     * @return ApiResponse<List<Map<String,Object>>>
     * @throws Exception Exception
     */
    @RequestMapping(value = {"/MAS_CD_GENEDATA_SELECT_BY_CONDITION"}, method = RequestMethod.POST)
    public ApiResponse<List<Map<String,Object>>> MAS_CD_GENEDATA_SELECT_BY_CONDITION(HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariableMap) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        Map<String,Object> parameterMap = new HashMap<>();
        for (Object key :pathVariableMap.keySet()){
            if(key instanceof String) {
                Object value = pathVariableMap.get(key);
                parameterMap.put(key.toString(), value);
            }
        }
        List<Map<String,Object>>result = mapper.selectCommonMasCd(CommonUtils.getParameterMap(request));
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }
}
