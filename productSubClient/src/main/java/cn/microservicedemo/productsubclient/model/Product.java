package cn.microservicedemo.productsubclient.model;
import lombok.Data;

/**
 * 商品的实体
 *
 * @author me
 */
@Data
public class Product {

    private Long id;

    private String name;

    private Double price;

    private long num;
}
