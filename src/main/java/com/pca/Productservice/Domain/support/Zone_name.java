package com.pca.Productservice.Domain.support;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Zone_name {
    CHECKIN("Check-in Area"),
    BOARDING("Boarding Area"),
    TRANSIT("Transit Area"),
    OPERATION("Operation Area"),
    BAGGAGE_DISPUTE("Baggage dispute Area");

    @Getter
    private String label;

    public String getLabel() {
        return label;
    }

}
