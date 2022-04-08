package com.pca.Productservice.Domain.support;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Counter {
    C1("Counter 1"),
    C2("Counter 2"),
    C3("Counter 3"),
    C4("Counter 4"),
    C5("Counter 5");
    @Getter
    private String label;

    public String getLabel() {
        return label;
    }
}
