package microservicedemo.productsubservice.controller;
import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import microservicedemo.productsubservice.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 商品的服务控制层
 */
@AllArgsConstructor
@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductMapper productDecrementMapper;

    @PutMapping("/subByProductId/{id}")
    public void decrementById(@PathVariable Long id, @RequestParam Long amount) {
        log.info("-------------OK   /subByProductId/{productId}--------------------");
        productDecrementMapper.decreaseById(id, amount);
    }

    @PutMapping("/subByProductName/{name}")
    public void decrementByName(@PathVariable String name, @RequestParam Long amount) {
        log.info("-------------OK   /subByProductId/{productId}--------------------");
        productDecrementMapper.decreaseByName(name, amount);
    }

    @PutMapping("/subAllProduct")
    public void decrementAll(@RequestParam Long amount) {
        log.info("-------------OK   /subByProductId/{productId}--------------------");
        productDecrementMapper.decreaseAll(amount);
    }

}
