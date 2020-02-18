package com.jerry.bootorderserver.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    Order findorderbyid(@Param("id") Integer id);
}
