package com.pca.Productservice.Domain.support;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Terminal {
    T1("Terminal 1"),
    T2("Terminal 2"),
    T3("Terminal 3"),
    T4("Terminal 4"),
    T5("Terminal 5");
    @Getter
    private String label;

    public String getLabel() {
        return label;
    }

}
