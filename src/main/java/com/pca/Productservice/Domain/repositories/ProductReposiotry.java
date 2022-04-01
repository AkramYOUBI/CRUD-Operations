package com.pca.Productservice.Domain.repositories;

import com.pca.Productservice.Domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReposiotry extends JpaRepository<Product, Long> {

}
