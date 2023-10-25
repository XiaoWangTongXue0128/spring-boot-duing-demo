package com.duing.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Endpoint(id = "customPoint")
 * 声明时一个端点，用id来命名
 */
@Component
@Endpoint(id = "customPoint")
public class CustomPoint {
    /**
     * @ReadOperation 当查看"customPoint"端点时的处理方法，需要返回JSON类型数据
     */
    @ReadOperation
    @ResponseBody
    public Map<String, String> custom() {
        Map<String, String> result = new HashMap<>();
        result.put("name", "hello custom endpoint");
        return result;
    }
}
