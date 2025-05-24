package cn.microservicedemo.productsearchclient.Client;

import cn.microservicedemo.productsearchclient.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Slf4j
@Component
public class ProductSearchServiceFallback implements ProductSearchServiceClient {

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public List<Product> getProductByName(String name) {
        return Collections.emptyList();
    }

    @Override
    public List<Product> getAllProducts() {
        return Collections.emptyList();
    }
}
