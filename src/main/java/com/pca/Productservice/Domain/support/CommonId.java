package com.pca.Productservice.Domain.support;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Value
public class CommonId implements EntityId<String> {
    @Column(name = "id")
    private String value;

    public CommonId(String prefix) {
        this.value = IDs.generate(prefix);
    }

    private CommonId() {
        this.value = IDs.generate("id_");
    }

    private CommonId(String value, String prefix) {
        this.value = value;
    }

    public static CommonId valueOf(String value) {
        if (value == null) return null;
        return new CommonId(value, null);
    }
}
