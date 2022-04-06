package com.pca.Productservice.Domain.entities;

import com.pca.Productservice.Domain.support.Etat;
import com.pca.Productservice.Domain.support.Terminal;
import com.pca.Productservice.Domain.support.Zone;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "productdb")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Equipement {
    @Id @GeneratedValue
    private Long id;
    private String numeroSerie;
    private String assetTag;
    private String nodeName;
    private String model;
    private String type;
    private String emplacement;
    private Terminal terminal;
    private Zone zone;
    private Integer comptoir;
    private Etat etat;
    private String commentaire;
    private Integer quantity;
}
