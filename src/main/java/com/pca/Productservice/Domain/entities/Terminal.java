package com.pca.Productservice.Domain.entities;

import liquibase.pro.packaged.I;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "terminaldb")
public class Terminal {
    @Id @GeneratedValue
    private Integer terminal_id;
    private String terminal_name;

    @ManyToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;
}
