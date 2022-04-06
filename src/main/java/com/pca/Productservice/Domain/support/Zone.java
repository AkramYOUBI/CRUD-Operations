package com.pca.Productservice.Domain.support;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Zone {
    ZEN("Zone d'enregistrement"),
    ZEM("Zone d'embarquement"),
    ZT("Zone de transit"),
    ZO("Zone d'opération"),
    ZLB("Zone de litige bagages");

    @Getter
    private String label;

    public String getLabel() {
        return label;
    }

}
