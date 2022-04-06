package com.pca.Productservice.Domain.support;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Model {
    IMP("Printer"),
    SC("Scanner"),
    KB("Keyboard"),
    SCR("Screen"),
    MS("Mouse"),
    PC("Computer");

    @Getter
    private String label;

    public String getLabel() {
        return label;
    }
}
