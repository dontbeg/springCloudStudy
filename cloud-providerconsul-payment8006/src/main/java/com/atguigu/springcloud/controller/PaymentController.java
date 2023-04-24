package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author shenlp
 * @Date 2023/4/14 17:37
 * @Description:
 **/
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentConsul()
    {
        return "springcloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
