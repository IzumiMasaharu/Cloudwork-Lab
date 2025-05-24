package microservicedemo.productaddservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"microservicedemo.productaddservice.controller"})
@MapperScan(basePackages= "microservicedemo.productaddservice.mapper")

public class ProductAddServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductAddServiceApplication.class, args);
    }

}
