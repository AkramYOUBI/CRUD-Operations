package com.pca.Productservice.Domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "airportdb")
public class Airport {
    @Id @GeneratedValue
    private Integer airport_id;
    private String airport_name;
    private String airport_city;

}
