package cn.microservicedemo.productaddclient.Client;

import cn.microservicedemo.productaddclient.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="productAddService",fallback = ProductAddServiceFallback.class)
public interface ProductAddServiceClient {
    @PutMapping("/addByProductId/{id}")
    void addQuantityById(@PathVariable("id") Long id, @RequestParam("amount") Long amount);

    @PutMapping("/addByProductName/{name}")
    void addQuantityByName(@PathVariable("name") String name, @RequestParam("amount") Long amount);

    @PutMapping("/addAllProduct")
    void addQuantityToAll(@RequestParam("amount") Long amount);
}
