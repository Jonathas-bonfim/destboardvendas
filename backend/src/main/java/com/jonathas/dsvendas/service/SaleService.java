package com.jonathas.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jonathas.dsvendas.dto.SaleDTO;
import com.jonathas.dsvendas.entities.Sale;
import com.jonathas.dsvendas.repositories.SaleRepository;
import com.jonathas.dsvendas.repositories.SellerRepository;


@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
//		convertendo os arquivos para DTO
		return result.map(x -> new SaleDTO(x));
	}

}


