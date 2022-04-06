package com.pca.Productservice.Domain.support;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Project {
    CUTE("CUTE"),
    EGATE("E-Gate"),
    BRS("BRS");
    @Getter
    private String label;

    public String getLabel() {
        return label;
    }
}
