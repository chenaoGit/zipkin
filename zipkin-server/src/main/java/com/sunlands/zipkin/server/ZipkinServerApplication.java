package com.sunlands.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
//@EnableZipkinServer// http
@EnableZipkinStreamServer //采用Stream通信方式启动ZipkinServer，也支持HTTP通信方式
//@EnableEurekaClient
public class ZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }
}
