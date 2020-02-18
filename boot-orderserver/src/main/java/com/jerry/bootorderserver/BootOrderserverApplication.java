package com.jerry.bootorderserver;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jerry.bootorderserver.mapper")
@EnableDubbo
public class BootOrderserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootOrderserverApplication.class, args);
        System.err.println(">>>>orderserver is finished   url:http://localhost:8082/getorder/1");
    }

}
