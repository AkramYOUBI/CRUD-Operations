package com.pca.Productservice.Domain.repositories;

import com.pca.Productservice.Domain.entities.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipementReposiotry extends JpaRepository<Equipement, Long> {

}
