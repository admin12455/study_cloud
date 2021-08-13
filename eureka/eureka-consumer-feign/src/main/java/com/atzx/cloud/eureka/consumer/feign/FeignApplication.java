package com.atzx.cloud.eureka.consumer.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by jzx on 2021/8/13 14:59
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignApplication.class)
                .web(true).run(args);
    }
}
