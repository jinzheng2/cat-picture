package com.yupi.mikupicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.yupi.mikupicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class MikuPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MikuPictureBackendApplication.class, args);
    }

}
