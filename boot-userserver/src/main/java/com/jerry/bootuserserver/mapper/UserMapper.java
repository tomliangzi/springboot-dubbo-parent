package com.jerry.bootuserserver.mapper;


import org.apache.ibatis.annotations.Param;
import org.example.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User findByid(@Param("id") Integer id);

}
