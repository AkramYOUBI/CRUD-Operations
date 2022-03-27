package com.pca.Productservice.repository;

import com.pca.Productservice.entity.Product;
import com.pca.Productservice.web.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReposiotry extends JpaRepository<Product, Long> {

    @Query("Select id from Product where ?1 or ?1 is null ")
    Response<Product> findbyfilter(String id);
}
