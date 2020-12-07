package com.tistory.f5074.spring_boot.controller;

import com.tistory.f5074.spring_boot.common.ApiResponse;
import com.tistory.f5074.spring_boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {
    @Autowired
    private UserMapper mapper;

    @RequestMapping(value = {"/users/","/users/{userId}"}, method = RequestMethod.GET)
    public ApiResponse<List<Map<String,Object>>> users(
              HttpServletRequest request
            , @PathVariable(name="userId", required = false) String userId) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        Map<String,Object> parameters = new HashMap<>();
        parameters.put("USER_ID", userId);

        List<Map<String,Object>>result = mapper.selectUsers(parameters);
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

    @RequestMapping(value = {"/users2/","/users2/{USER_ID}/{USER_PW}"}, method = RequestMethod.GET)
    public ApiResponse<List<Map<String,Object>>> users2(
              HttpServletRequest request
            , @PathVariable Map<String, Object> pathVariables) throws Exception {
        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
        Map<String,Object> parameterMap = new HashMap<>();

        for (Object key :pathVariables.keySet()){
            Object value = pathVariables.get(key);
            System.out.println(key.toString());
            System.out.println(value.toString());
            parameterMap.put(key.toString(), value);
        }

//
//
//        if(pathVariables.containsKey("userId")){
//            parameterMap.put("USER_ID",pathVariables.get("userId"));
//        }
//        if(pathVariables.containsKey("userPw")){
//            parameterMap.put("USER_PW",pathVariables.get("userPw"));
//        }


        List<Map<String,Object>>result = mapper.selectUsers(parameterMap);
        response.setData(result);
        response.setErrors("SUCCESS");
        return response;
    }

//    @RequestMapping(value = {"/users"}, method = RequestMethod.POST)
//    public ApiResponse<List<Map<String,Object>>> users(HttpServletRequest request) throws Exception {
//        ApiResponse<List<Map<String,Object>>> response = new ApiResponse<>();
//        Map<String,Object> parameters = new HashMap<>();
//        parameters.put("USER_ID",request.getParameter("USER_ID"));
//
//        List<Map<String,Object>> resultMap = new ArrayList<>();
//        Map<String,Object> result = mapper.jsonObject(parameters);
//        resultMap.add(result);
//        response.setData(resultMap);
//        response.setErrors("SUCCESS");
//        return response;
//    }
}
