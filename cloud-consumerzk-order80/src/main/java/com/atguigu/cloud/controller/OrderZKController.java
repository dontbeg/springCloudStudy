package com.atguigu.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author shenlp
 * @Date 2023/4/14 15:50
 * @Description:
 **/
@RestController
@Slf4j
public class OrderZKController {
    private static final String INVOKE_URL = "http://cloud-provider-payment";


    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo()
    {
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return result;
    }
}
