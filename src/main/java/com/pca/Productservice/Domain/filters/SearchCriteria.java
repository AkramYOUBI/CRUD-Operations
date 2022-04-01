package com.pca.Productservice.Domain.filters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCriteria {
    private String name;
    private Double price;
    private String assetTag;
    private Integer quantity;
    private Integer number;
    private Integer pageSize;
    private Integer PageOffset;
}
