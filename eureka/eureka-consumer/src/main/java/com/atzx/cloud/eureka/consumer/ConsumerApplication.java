package com.atzx.cloud.eureka.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jzx on 2021/6/3 14:42
 */
//@EnableDiscoveryClient注解用来将当前应用加入到服务治理体系中。
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

    /**
     * 初始化RestTemplate，用来真正发起REST请求。
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerApplication.class)
                .web(true).run(args);
    }
}
