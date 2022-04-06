package com.pca.Productservice.Domain.entities;

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
@Entity
public class Airport {
    @Id @GeneratedValue
    private Integer airport_id;
    private String name;
    private String city;
    private Terminal terminal;
    private Zone zone;
    private String counter;

    @OneToMany( targetEntity=Equipment.class, mappedBy="airport" )
    private List<Equipment> equipmentList = new ArrayList<>();
}
