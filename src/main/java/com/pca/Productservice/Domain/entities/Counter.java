package com.pca.Productservice.Domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "counterdb")
public class Counter {
    @Id @GeneratedValue
    private Integer counter_id;
    private String counter_name;

    @ManyToOne
    @JoinColumn(name = "zone_id")
    private Zone zone;

    @ManyToOne
    @JoinColumn(name = "terminal_id")
    private Terminal terminal;
    @ManyToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;
}
