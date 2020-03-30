package com.hidialect.hidialect_ws;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hidialect.hidialect_ws.dao")
@SpringBootApplication
public class HidialectWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HidialectWsApplication.class, args);
    }

}
