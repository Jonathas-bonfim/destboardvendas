package com.jonathas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathas.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
