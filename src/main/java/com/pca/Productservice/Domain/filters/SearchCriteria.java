package com.pca.Productservice.Domain.filters;

import com.pca.Productservice.Domain.entities.Airport;
import com.pca.Productservice.Domain.support.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCriteria {
    private String serialNumber;
    private String assetTag;
    private String nodeName;
    private Model model;
    private Type type;
    private Project project;
    private Site site;
    private State state;
    private Integer quantity;
    private String comment;
    private Airport airport;
    private Integer pageSize;
    private Integer PageOffset;
}
