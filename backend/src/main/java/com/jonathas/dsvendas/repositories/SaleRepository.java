package com.jonathas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathas.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
