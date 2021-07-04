package com.projet.boot.infrastructure.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.boot.infrastructure.dto.ChequeDto;

/**
 * Class service cheque
 * 
 * @author somap
 *
 */
@Service
public interface ChequeService {

	/**
	 * Get one cheque by identifier
	 * 
	 * @param id
	 * @return dt cheque
	 */
	Optional<ChequeDto> findOneById(long id);

	/**
	 * Create cheque
	 * 
	 * @return Cheque Dto
	 */
	Optional<ChequeDto> create(Optional<ChequeDto> chequeDto);

}
