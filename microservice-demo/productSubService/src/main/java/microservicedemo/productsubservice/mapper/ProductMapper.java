package microservicedemo.productsubservice.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

public interface ProductMapper {
    @Update("UPDATE product SET num = num - #{amount} WHERE id = #{id} AND num >= #{amount}")
    void decreaseById(@Param("id") Long id, @Param("amount") Long amount);

    @Update("UPDATE product SET num = num - #{amount} WHERE name = #{name} AND num >= #{amount}")
    void decreaseByName(@Param("name") String name, @Param("amount") Long amount);

    @Update("UPDATE product SET num = num - #{amount} WHERE num >= #{amount}")
    void decreaseAll(@Param("amount") Long amount);
}
