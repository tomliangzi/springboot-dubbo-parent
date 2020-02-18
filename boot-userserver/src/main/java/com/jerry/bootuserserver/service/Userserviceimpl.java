package com.jerry.bootuserserver.service;

import com.jerry.bootuserserver.mapper.UserMapper;
import org.example.entity.User;
import org.example.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimpl implements Userservice {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getuser(Integer id) {
        return userMapper.findByid(id);
    }
}
