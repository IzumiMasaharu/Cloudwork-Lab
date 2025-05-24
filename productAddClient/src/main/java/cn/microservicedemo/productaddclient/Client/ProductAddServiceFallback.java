package cn.microservicedemo.productaddclient.Client;

import cn.microservicedemo.productaddclient.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

@Slf4j
@Component
public class ProductAddServiceFallback implements ProductAddServiceClient {

    @Override
    public void addQuantityById(Long id, Long amount) {
        // log or fallback
    }

    @Override
    public void addQuantityByName(String name, Long amount) {
        // log or fallback
    }

    @Override
    public void addQuantityToAll(Long amount) {
        // log or fallback
    }
}
