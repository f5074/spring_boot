package com.tistory.f5074.spring_boot.common.utils;

import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class CommonUtils {

    /**
     * HttpServletRequest to Map
     * @param request HttpServletRequest
     * @return Map
     */
    public static HashMap<String, Object> getParameterMap(HttpServletRequest request){

        HashMap<String, Object> parameterMap = new HashMap<>();
        Enumeration<String> enums = request.getParameterNames();
        while(enums.hasMoreElements()){
            String paramName = enums.nextElement();
            String[] parameters = request.getParameterValues(paramName);
            // Parameter가 배열일 경우
            if(paramName.equals("ITEM_CD") && !StringUtils.isEmpty(parameters[0])){
                String value = parameters[0];
                parameterMap.put(paramName, Arrays.asList(value.split(",")));
            // Parameter가 배열이 아닌 경우
            }else{
                parameterMap.put(paramName, parameters[0]);
            }

//            // Parameter가 배열일 경우
//            if(parameters.length > 1){
//                parameterMap.put(paramName, parameters);
//                // Parameter가 배열이 아닌 경우
//            }else{
//                parameterMap.put(paramName, parameters[0]);
//            }
        }
        return parameterMap;
    }

    /**
     * Contains Map Value to HashMap
     * @param map Map
     * @return map Map
     */
    public static Map<String, Object> getContainsMap(@SuppressWarnings("rawtypes") Map map){
        HashMap<String, Object> parameterMap = new HashMap<>();
        for (Object key :map.keySet()){
            if(key instanceof String) {
                Object value = map.get(key);
                parameterMap.put(key.toString(), value);
            }
        }
        return parameterMap;
    }
}
