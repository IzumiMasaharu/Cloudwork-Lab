package cn.microservicedemo.productsubclient.Client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProductSubServiceFallback implements ProductSubServiceClient {

    @Override
    public void decreaseById(Long id, Long amount) {
        // fallback log
    }

    @Override
    public void decreaseByName(String name, Long amount) {
        // fallback log
    }

    @Override
    public void decreaseAll(Long amount) {
        // fallback log
    }
}
