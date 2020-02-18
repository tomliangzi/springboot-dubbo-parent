package com.jerry.bootorderserver.controller;


import org.example.entity.Order;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ordercontroller {


    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/getorder/{id}")
    public Order getuser(@PathVariable("id") final Integer id){

        return orderService.getorder(id);
    }

}