package com.duing.controller;

import com.duing.bean.Food;
import com.duing.bean.Vegetables;
import com.duing.config.FoodConfig;
import com.duing.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 返回JSON形式的字符串
 * 等效于@Controller+@ResponseBody
 */
@RestController
public class JsonController {
//    @Value("${food.testA}")
//    private String testA;
//    @Value("${food.testA}")
//    private String testB;
//    @Value("#{'${food.testC}'.split(',')}")
////    @Value("${food.testC}")
//    private String[] testC;

//    @Autowired
//    private Food food;

    @Autowired
    private FoodConfig foodConfig;

    @Autowired
    private VegetablesConfig vegetablesConfig;

    /*

    @Value("${info.username}")
    private String username;

    @Value("${info.password}")
    private String password;

     */

    @RequestMapping("json")
    public String json() {
        return "hello json";
    }

    @RequestMapping("food")
    public Food food() {
        Food food = new Food();
        food.setTestA(foodConfig.getTestA());
        food.setTestB(foodConfig.getTestB());
        food.setTestC(foodConfig.getTestC());
//        food.setTestA(testA);
//        food.setTestB(testB);
//        food.setTestC(testC);
        return food;
    }

    @RequestMapping("vegetables")
    public Vegetables vegetables() {
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        return vegetables;
    }
/*

    @RequestMapping("jasypt")
    public String jasypt() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(username);
        stringBuffer.append("\t");
        stringBuffer.append(password);
        return stringBuffer.toString();
    }

 */


}
