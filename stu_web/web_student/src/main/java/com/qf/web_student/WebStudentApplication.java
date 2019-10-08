package com.qf.web_student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
@MapperScan(basePackages = "com.qf.dao")
@EnableFeignClients(basePackages = "com.qf.feign")
public class WebStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStudentApplication.class, args);
    }

}
