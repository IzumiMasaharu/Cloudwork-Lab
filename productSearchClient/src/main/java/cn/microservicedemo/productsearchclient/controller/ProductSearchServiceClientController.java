package cn.microservicedemo.productsearchclient.controller;

import cn.microservicedemo.productsearchclient.Client.ProductSearchServiceClient;
import cn.microservicedemo.productsearchclient.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@Slf4j
public class ProductSearchServiceClientController {

    @Autowired
    private final ProductSearchServiceClient prodServiceClient;

    /**
     * 根据商品id查询商品
     */
    @CrossOrigin(origins = "http://localhost:5173") // 允许前端端口
    @GetMapping("/findByProductId/{id}")
    public Product getProductById(@PathVariable Long id) {
        log.info("--------------In ProductSearchServiceClient findByProductId---------------------");
        return prodServiceClient.getProductById(id);
    }

    /**
     * 根据商品name查询商品
     */
    @CrossOrigin(origins = "http://localhost:5173") // 允许前端端口
    @GetMapping("/findByProductByName/{name}")
    public List<Product> getProductByName(@PathVariable String name) {
        log.info("--------------In ProductSearchServiceClient findByProductName---------------------");
        return prodServiceClient.getProductByName(name);
    }

    /**
     * 查询所有商品
     */
    @CrossOrigin(origins = "http://localhost:5173") // 允许前端端口
    @GetMapping("/queryAllProduct")
    public List<Product> getAllProducts() {
        log.info("--------------In ProductSearchServiceClient queryAllProduct---------------------");
        return prodServiceClient.getAllProducts();
    }

}
