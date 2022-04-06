package com.pca.Productservice.Domain.support;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IDs {

    public static String generate(String prefix) {
        return prefix + UUID.randomUUID().toString().replace("-", "");
    }

    public static String generateNumContrat() {
        Instant instant = Instant.now();
        long timeStampSeconds  = instant.getEpochSecond();
        return  Long.toString(timeStampSeconds);
    }
}
