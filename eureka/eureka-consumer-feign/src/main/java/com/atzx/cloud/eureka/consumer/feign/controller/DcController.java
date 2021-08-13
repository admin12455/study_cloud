package com.atzx.cloud.eureka.consumer.feign.controller;

import com.atzx.cloud.eureka.consumer.feign.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jzx on 2021/8/13 15:16
 */
@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String cousmer(){

        return dcClient.consumer();
    }
}
