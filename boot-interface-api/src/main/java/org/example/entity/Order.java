package org.example.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Order implements Serializable {

    private int id;

    private String address;
}
