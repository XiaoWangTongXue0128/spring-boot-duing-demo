package com.duing.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ControllerAdvice——切面方法
 * 监听所有在Controller中出现的异常，执行@ExceptionHandler(Exception.class)注解的方法，跳转错误页
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView handler(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/error");
        mv.addObject("message", e.getMessage());
        return mv;
    }
}
