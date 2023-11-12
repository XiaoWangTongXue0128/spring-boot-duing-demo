package com.duing.controller;

import com.duing.bean.Guest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.lang.reflect.Field;
import java.util.List;

@RestController
public class GuestController {

    /**
     * @Valid 放在bean前面，用来校验bean是否符合规则，校验不通过时返回400和失败原因，默认普通模式
     * BindingResult 自定义校验失败时的异常error信息
     */
    @PostMapping("/guest")
    public String add(@Valid Guest guest, BindingResult result) {
        if (result.getErrorCount() > 0) {
            List<FieldError> fieldErrorList = result.getFieldErrors();
            StringBuffer stringBuffer = new StringBuffer();
            for (FieldError fieldError : fieldErrorList) {
                stringBuffer.append(fieldError.getField());
                stringBuffer.append("\t");
                stringBuffer.append(fieldError.getDefaultMessage());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }
        return "success";
    }


}
