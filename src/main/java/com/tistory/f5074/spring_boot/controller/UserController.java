package com.tistory.f5074.spring_boot.controller;

import com.tistory.f5074.spring_boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class UserController {
    @Autowired
    private UserMapper mapper;

    String resultmsg = "";

    @RequestMapping(value = "/checkUserId", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> checkUserId(HttpServletRequest request) throws Exception {
        int cnt = mapper.checkUserId(request.getParameter("userId"));

        Map<String, Object> jsonObject = new HashMap<String, Object>();

        if (cnt == 0) {
            resultmsg = "ID can be used";
        } else {
            resultmsg = "ID not available";
        }
        jsonObject.put("resultmsg", resultmsg);

        return jsonObject;
    }

}