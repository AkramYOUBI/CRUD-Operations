package com.pca.Productservice.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
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
