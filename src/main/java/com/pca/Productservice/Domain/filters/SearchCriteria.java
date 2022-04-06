package com.pca.Productservice.Domain.filters;

import com.pca.Productservice.Domain.support.Etat;
import com.pca.Productservice.Domain.support.Terminal;
import com.pca.Productservice.Domain.support.Zone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCriteria {
    //Projet-Aeroport
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
    private Integer pageSize;
    private Integer PageOffset;
}
