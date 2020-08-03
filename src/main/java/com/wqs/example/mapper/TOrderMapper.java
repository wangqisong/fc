package com.wqs.example.mapper;

import com.wqs.example.pojo.TOrder;
import org.apache.ibatis.annotations.*;
import java.util.Optional;


@Mapper
public interface TOrderMapper {
    @Insert("insert into t_order(order_num,owner_id,order_status,pay_status,address) " +
            "VALUES (#{orderNum},#{ownerId},#{orderStatus},#{payStatus},#{address})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertOrder(TOrder tOrder);

    @Select("select * from t_order where id=#{id}")
    /*@Results({
            @Result(property = "orderNum", column = "order_num"),
            @Result(property = "ownerId", column = "owner_id"),
    })*/
    Optional<TOrder> findOneOrderById(Integer id);
}
