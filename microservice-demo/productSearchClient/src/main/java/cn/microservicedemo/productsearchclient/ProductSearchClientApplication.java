package cn.microservicedemo.productsearchclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(scanBasePackages = {"cn.microservicedemo.productsearchclient.controller", "cn.microservicedemo.productsearchclient.Client"})
@EnableEurekaClient
@EnableFeignClients("cn.microservicedemo.productsearchclient.Client")
public class ProductSearchClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductSearchClientApplication.class, args);
    }

}
