package com.pca.Productservice.Domain.repositories;

import com.pca.Productservice.Domain.entities.Counter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository<Counter, Integer> {
}
