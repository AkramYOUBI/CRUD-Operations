package com.pca.Productservice.Domain.support;

import java.io.Serializable;

public interface EntityId<T> extends Serializable {

    T getValue();

}