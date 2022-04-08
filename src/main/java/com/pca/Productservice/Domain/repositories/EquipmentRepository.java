package com.pca.Productservice.Domain.repositories;

import com.pca.Productservice.Domain.entities.Equipment;
import com.pca.Productservice.Domain.support.CommonId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, CommonId> {

}
