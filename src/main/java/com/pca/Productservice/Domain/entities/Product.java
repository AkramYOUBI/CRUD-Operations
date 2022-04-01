package com.pca.Productservice.Domain.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "productdb")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private Double price;
    private String assetTag;
    private Integer quantity;
    private Integer number;
}
