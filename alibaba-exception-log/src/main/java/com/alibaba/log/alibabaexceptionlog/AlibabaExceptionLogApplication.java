package com.alibaba.log.alibabaexceptionlog;

import InvacationHandler.VehicalInvacationHandler;
import Utils.log.LoggerHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import proxy.IVehical;
import proxyImpl.Car;

import java.lang.reflect.Proxy;
import java.util.Date;

@SpringBootApplication
@ComponentScan(basePackages = {"Utils.log"})
public class AlibabaExceptionLogApplication {

    public static void main(String[] args) {
        LoggerHelper.logInfo(new Date().toString()+":test666");
        SpringApplication.run(AlibabaExceptionLogApplication.class, args);
        testProxy();
        //test code
    }

    //test proxy
    private static void testProxy(){
        IVehical car = new Car();

        IVehical vehical = (IVehical) Proxy.newProxyInstance(car.getClass().getClassLoader(), Car.class.getInterfaces(), new VehicalInvacationHandler(car));
        vehical.run();

    }
}
