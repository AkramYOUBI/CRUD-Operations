package com.pca.Productservice.Domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pca.Productservice.Domain.support.Terminal;
import com.pca.Productservice.Domain.support.Zone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "airportdb")
public class Airport {
    //Solving problem in the copy properties(update, ignoreprop...)
    @Id @GeneratedValue
    private Integer airport_id;
    private String airport_name;
    private String airport_city;

}
