package com.pca.Productservice.Domain.repositories;

import com.pca.Productservice.Domain.entities.Zone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneRepository extends JpaRepository<Zone, Integer> {
}
