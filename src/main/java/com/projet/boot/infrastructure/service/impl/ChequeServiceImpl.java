package com.projet.boot.infrastructure.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet.boot.infrastructure.dto.ChequeDto;
import com.projet.boot.infrastructure.model.Cheque;
import com.projet.boot.infrastructure.repository.ChequeRepository;
import com.projet.boot.infrastructure.service.ChequeService;

public class ChequeServiceImpl implements ChequeService {

	@Autowired
	ChequeRepository repository;

	@Override
	public Optional<ChequeDto> findOneById(long id) {
//		Optional<ChequeDto> chequeDto = Optional.empty();
//		Optional<Cheque> cheque = Optional.empty();
//
//		cheque = repository.findById(id);
//		chequeDto = Cheque.ChequeMapper.modelToDto(cheque);

		return Cheque.ChequeMapper.modelToDto(repository.findById(id));
	}

	@Override
	public Optional<ChequeDto> create(Optional<ChequeDto> chequeDto) {

//		// initialisation param
//		Cheque cheque = null;
//		Optional<ChequeDto> chDto = Optional.empty();
//		// mapping dto to entity
//		cheque = Cheque.ChequeMapper.dtoToModel(chequeDto).orElse(null);
//		//appel methode save convert to optional and map to dto
//		chDto=Cheque.ChequeMapper.modelToDto(Optional.ofNullable(repository.save(cheque)));

		return Cheque.ChequeMapper.modelToDto(
				Optional.ofNullable(repository.save(Cheque.ChequeMapper.dtoToModel(chequeDto).orElse(null))));
	}

}
