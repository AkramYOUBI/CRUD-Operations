package com.pca.Productservice.Domain.support;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Site {
    PROD("Production"),
    STOCK("Stock");
    @Getter
    private String label;

    public String getLabel() {
        return label;
    }
}
