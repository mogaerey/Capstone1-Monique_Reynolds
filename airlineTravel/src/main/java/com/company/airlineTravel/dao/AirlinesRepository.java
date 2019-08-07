package com.company.airlineTravel.dao;

import com.company.airlineTravel.dto.Airlines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlinesRepository extends JpaRepository<Airlines, Integer> {
}
