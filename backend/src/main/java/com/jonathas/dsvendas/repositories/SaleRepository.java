package com.jonathas.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jonathas.dsvendas.dto.SaleSuccessDTO;
import com.jonathas.dsvendas.dto.SaleSumDTO;
import com.jonathas.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
//	utilizando o JPQL
	@Query("SELECT new com.jonathas.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.jonathas.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
