package com.pca.Productservice.Domain.support;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {
    private boolean success;
    private int status;
    private T data;
    private String error;


}
