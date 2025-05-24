package microservicedemo.productsubservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"microservicedemo.productsubservice.controller"})
@MapperScan(basePackages= "microservicedemo.productsubservice.mapper")

public class ProductSubServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductSubServiceApplication.class, args);
    }

}
