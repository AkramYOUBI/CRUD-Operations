package com.pca.Productservice.Domain.support;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Type {
    APPLE("Apple"),
    SAMSUNG("Samsung"),
    HP("Hp"),
    DELL("Dell"),
    LENOVO("Lenovo");

    @Getter
    private String label;

    public String getLabel() {
        return label;
    }
}
