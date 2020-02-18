package com.jerry.bootuserserver;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan("com.jerry.bootuserserver.mapper")
@EnableDubbo
public class BootUserserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserserverApplication.class, args);
		System.err.println(">>>>userserver is finished ,url:http://localhost:8081/getuser/1");
	}

}
