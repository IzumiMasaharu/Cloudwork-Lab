package cn.microservicedemo.productsearchclient.Client;

import cn.microservicedemo.productsearchclient.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "productSearchService", fallback = ProductSearchServiceFallback.class)
public interface ProductSearchServiceClient {

    @GetMapping("/findByProductId/{id}")
    Product getProductById(@PathVariable("id") Long id);

    @GetMapping("/findByProductName/{name}")
    List<Product> getProductByName(@PathVariable("name") String name);

    @GetMapping("/queryAllProduct")
    List<Product> getAllProducts();
}
