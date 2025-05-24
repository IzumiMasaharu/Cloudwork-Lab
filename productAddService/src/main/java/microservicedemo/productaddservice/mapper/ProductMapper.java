package microservicedemo.productaddservice.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

public interface ProductMapper {
    @Update("UPDATE product SET num = num + #{amount} WHERE id = #{id}")
    void addQuantityById(@Param("id") Long id, @Param("amount") Long amount);

    @Update("UPDATE product SET num = num + #{amount} WHERE name = #{name}")
    void addQuantityByName(@Param("name") String name, @Param("amount") Long amount);

    @Update("UPDATE product SET num = num + #{amount}")
    void addQuantityToAll(@Param("amount") Long amount);
}
