package com.zxx.action.demo.annotation;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ${zhouxx} on 2018/6/7
 */
public class HelloWorldController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        System.out.println("-----------------begin--hh----------------");
        return new ModelAndView("/welcome");
    }
}
