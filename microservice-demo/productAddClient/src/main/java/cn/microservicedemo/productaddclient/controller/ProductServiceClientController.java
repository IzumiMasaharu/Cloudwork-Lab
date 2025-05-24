package cn.microservicedemo.productaddclient.controller;

import cn.microservicedemo.productaddclient.Client.ProductAddServiceClient;
import cn.microservicedemo.productaddclient.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@Slf4j
public class ProductServiceClientController {

    @Autowired
    private ProductAddServiceClient productUpdateClient;

    @PutMapping("/addByProductId/{id}")
    public void updateById(@PathVariable Long id, @RequestParam Long amount) {
        productUpdateClient.addQuantityById(id, amount);
    }

    @PutMapping("/addByProductName/{name}")
    public void updateByName(@PathVariable String name, @RequestParam Long amount) {
        productUpdateClient.addQuantityByName(name, amount);
    }

    @PutMapping("/addAllProduct")
    public void updateAll(@RequestParam Long amount) {
        productUpdateClient.addQuantityToAll(amount);
    }

}
