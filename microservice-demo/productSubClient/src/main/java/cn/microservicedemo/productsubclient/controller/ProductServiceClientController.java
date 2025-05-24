package cn.microservicedemo.productsubclient.controller;

import cn.microservicedemo.productsubclient.Client.ProductSubServiceClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@Slf4j
public class ProductServiceClientController {
    @Autowired
    private ProductSubServiceClient productDecrementClient;

    @PutMapping("/subByProductId/{id}")
    public void decrementById(@PathVariable Long id, @RequestParam Long amount) {
        productDecrementClient.decreaseById(id, amount);
    }

    @PutMapping("/subByProductName/{name}")
    public void decrementByName(@PathVariable String name, @RequestParam Long amount) {
        productDecrementClient.decreaseByName(name, amount);
    }

    @PutMapping("/subAllProduct")
    public void decrementAll(@RequestParam Long amount) {
        productDecrementClient.decreaseAll(amount);
    }

}
