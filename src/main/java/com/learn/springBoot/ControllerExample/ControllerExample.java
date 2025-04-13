package com.learn.springBoot.ControllerExample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerExample {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)   // for using get mapping
    @ResponseBody                   // return as json in http response
    public String getUserName(){
        return  "fetching Vishal";
    }


    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)   // for using get mapping
    @ResponseBody                   // return as json in http response
    public String updatetUserName(){
        return  "Update vishal user";
    }

}
