package com.qf.stu_classes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
@MapperScan(basePackages = "com.qf.dao")
public class StuClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuClassesApplication.class, args);
    }

}
