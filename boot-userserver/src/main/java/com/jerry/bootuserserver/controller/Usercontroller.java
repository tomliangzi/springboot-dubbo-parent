package com.jerry.bootuserserver.controller;



import com.alibaba.dubbo.config.annotation.Reference;
import org.example.entity.Order;
import org.example.entity.User;
import org.example.service.OrderService;
import org.example.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {


    @Autowired
    Userservice userservice;

    @Reference
    OrderService orderService;

    @RequestMapping(value = "/getuser/{id}")
    public String getuser(@PathVariable("id") final Integer id){

        User user = userservice.getuser(id);
        Order order = orderService.getorder(user.getId());
        return user.toString()+order.toString();
    }

}