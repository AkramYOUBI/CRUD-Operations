package com.pca.Productservice.repository;

import com.pca.Productservice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReposiotry extends JpaRepository<Product, Long> {

}
