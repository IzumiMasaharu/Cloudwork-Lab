package microservicedemo.productaddservice.controller;
import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import microservicedemo.productaddservice.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品的服务控制层
 */
@AllArgsConstructor
@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductMapper productUpdateMapper;

    @PutMapping("/addByProductId/{id}")
    public void updateById(@PathVariable Long id, @RequestParam Long amount) {
        log.info("-------------OK   /addByProductId/{productId}--------------------");
        productUpdateMapper.addQuantityById(id, amount);
    }

    @PutMapping("/addByProductName/{name}")
    public void updateByName(@PathVariable String name, @RequestParam Long amount) {
        log.info("-------------OK   /addByProductName/{productId}--------------------");
        productUpdateMapper.addQuantityByName(name, amount);
    }

    @PutMapping("/addAllProduct")
    public void updateAll(@RequestParam Long amount) {
        log.info("-------------OK   /addAllProduct/{productId}--------------------");
        productUpdateMapper.addQuantityToAll(amount);
    }

}
