package cn.microservicedemo.productsubclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(scanBasePackages = {"cn.microservicedemo.productsubclient.controller", "cn.microservicedemo.productsubclient.Client"})
@EnableEurekaClient
@EnableFeignClients("cn.microservicedemo.productsubclient.Client")
public class ProductSubClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductSubClientApplication.class, args);
    }

}
