package cn.microservicedemo.productsubclient.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="productSubService",fallback = ProductSubServiceFallback.class)
public interface ProductSubServiceClient {
    @PutMapping("/subByProductId/{id}")
    void decreaseById(@PathVariable("id") Long id, @RequestParam("amount") Long amount);

    @PutMapping("/subByProductName/{name}")
    void decreaseByName(@PathVariable("name") String name, @RequestParam("amount") Long amount);

    @PutMapping("/subAllProduct")
    void decreaseAll(@RequestParam("amount") Long amount);
}
