package com.duing;

import com.duing.bean.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;


public class GuestValidTest {
    public static void main(String[] args) {
        /**
         * 校验框架的“普通模式”
         * 遍历所有属性，不符合的全部返回
         */
        //创建一个Validator实例
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        /**
         * "快速失败"模式的实例
         * 有一个不符合就返回
         */
        Validator validatorFastFail=Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast","true")
                .buildValidatorFactory().getValidator();
        //创建不符合要求的实例
        Guest guest = new Guest("", "");
        //开始验证，接收验证结果
        Set<ConstraintViolation<Guest>> violationSet = validator.validate(guest);
        for (ConstraintViolation<Guest> violation : violationSet) {
            System.out.println(violation.getPropertyPath()+"+"+violation.getMessage());
        }
        System.out.println("-----------------------");

        Set<ConstraintViolation<Guest>> violationFastFailSet = validatorFastFail.validate(guest);
        for (ConstraintViolation<Guest> violation : violationFastFailSet) {
            System.out.println(violation.getPropertyPath()+"+"+violation.getMessage());
        }
    }
}
