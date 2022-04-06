package com.pca.Productservice.Domain.support;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum State {
    OK("OK"),
    NOK("Not OK");

    @Getter
    private String label;

    public String getLabel() {
        return label;
    }
}
