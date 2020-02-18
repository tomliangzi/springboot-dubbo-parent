package com.jerry.bootorderserver.service;

import com.jerry.bootorderserver.mapper.OrderMapper;
import org.example.entity.Order;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@com.alibaba.dubbo.config.annotation.Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public Order getorder(Integer id) {
        return orderMapper.findorderbyid(id);
    }
}
