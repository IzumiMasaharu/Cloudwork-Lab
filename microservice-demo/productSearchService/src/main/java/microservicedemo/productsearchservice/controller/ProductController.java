package microservicedemo.productsearchservice.controller;
import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import microservicedemo.productsearchservice.mapper.ProductMapper;
import microservicedemo.productsearchservice.po.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    /**
     * 根据商品id查询商品
     */
    @GetMapping("/findByProductId/{id}")
    public Product getProductById(@PathVariable Long id) {
        log.info("-------------OK   /findByProductId/{productId}--------------------");
        return productMapper.findById(id);
    }

    /**
     * 根据商品name查询商品
     */
    @GetMapping("/findByProductName/{name}")
    public List<Product> getProductByName(@PathVariable String name) {
        log.info("-------------OK   /findByProductName/{productName}--------------------");
        return productMapper.findByName(name);
    }

    /**
     * 查询所有商品
     */
    @GetMapping("/queryAllProduct")
    public List<Product> getAllProducts() {
        log.info("-------------OK   queryAllProduct--------------------");
        return productMapper.findAll();
    }
}
