package com.pca.Productservice.Domain.repositories;

import com.pca.Productservice.Domain.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Equipment, Long> {

}
