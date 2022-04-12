package com.pca.Productservice.Domain.repositories;

import com.pca.Productservice.Domain.entities.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerminalRepository extends JpaRepository<Terminal, Integer> {
}
