package microservicedemo.productsearchservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"microservicedemo.productsearchservice.controller"})
@MapperScan(basePackages= "microservicedemo.productsearchservice.mapper")

public class ProductSearchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductSearchServiceApplication.class, args);
    }

}
