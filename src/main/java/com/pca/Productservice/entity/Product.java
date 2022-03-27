package com.pca.Productservice.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity //(Entitté b.d)
@AllArgsConstructor //(constructeur avec param)
@NoArgsConstructor
@Data
public class Product {
    @Id
    private Long id;
    private String name;
    private Integer number;
}
