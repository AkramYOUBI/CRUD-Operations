package com.pca.Productservice.Domain.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
    private String numFacture;
    private Date dateFacture;
    private String titreImportation;
    private Date dateImportation;

}