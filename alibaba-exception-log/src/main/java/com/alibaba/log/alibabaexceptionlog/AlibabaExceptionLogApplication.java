package com.alibaba.log.alibabaexceptionlog;

import Utils.log.LoggerHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

@SpringBootApplication
@ComponentScan(basePackages = {"Utils.log"})
public class AlibabaExceptionLogApplication {

    public static void main(String[] args) {
        LoggerHelper.logInfo(new Date().toString()+":test666");
        SpringApplication.run(AlibabaExceptionLogApplication.class, args);
        //test code
    }

}
