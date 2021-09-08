package com.jonathas.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathas.dsvendas.dto.SellerDTO;
import com.jonathas.dsvendas.entities.Seller;
import com.jonathas.dsvendas.repositories.SellerRepository;


@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
//		convertendo os arquivos para DTO
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
