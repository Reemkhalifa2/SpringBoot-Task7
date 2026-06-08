package com.example.Task7Demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private Integer productId;
    private String productName;
    private Double price;

}