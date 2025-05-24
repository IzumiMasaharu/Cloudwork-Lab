package cn.microservicedemo.productaddclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(scanBasePackages = {"cn.microservicedemo.productaddclient.controller", "cn.microservicedemo.productaddclient.Client"})
@EnableEurekaClient
@EnableFeignClients("cn.microservicedemo.productaddclient.Client")
public class ProductAddClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductAddClientApplication.class, args);
    }

}
