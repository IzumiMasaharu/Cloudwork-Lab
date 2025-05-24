package microservicedemo.productsearchservice.mapper;

import microservicedemo.productsearchservice.po.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("SELECT * FROM product WHERE id = #{id}")
    Product findById(@Param("id") Long id);

    @Select("SELECT * FROM product WHERE name = #{name}")
    List<Product> findByName(@Param("name") String name);

    @Select("SELECT * FROM product")
    List<Product> findAll();
}
