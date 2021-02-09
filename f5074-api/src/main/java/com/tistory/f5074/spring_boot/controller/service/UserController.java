package com.tistory.f5074.spring_boot.controller.service;

import com.tistory.f5074.spring_boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class UserController {
    @Autowired
    private UserMapper mapper;

    @SuppressWarnings("UnnecessaryLocalVariable")
    @RequestMapping(value = {"/jsonObject"}, method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> jsonObject(HttpServletRequest request) throws Exception {
        Map<String,Object> parameters = new HashMap<>();
        parameters.put("USER_ID",request.getParameter("user"));
        Map<String,Object> resultMap = mapper.jsonObject(parameters);
        return resultMap;
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    @RequestMapping(value = {"/jsonList"}, method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> jsonList(HttpServletRequest request) throws Exception {
        Map<String,Object> parameters = new HashMap<>();
        parameters.put("USER_ID",request.getParameter("user"));
        List<Map<String,Object>> resultMap = mapper.jsonList(parameters);
        return resultMap;
    }
}