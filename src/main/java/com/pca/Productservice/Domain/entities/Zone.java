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
@Entity(name = "zonedb")
public class Zone {
    @Id @GeneratedValue
    private Integer zone_id;
    private String zone_name;

    @ManyToOne
    @JoinColumn(name = "terminal_id")
    private Terminal terminal;
    @ManyToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;
}
