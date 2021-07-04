package com.projet.boot.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.boot.infrastructure.model.Cheque;

@Repository
public interface ChequeRepository extends JpaRepository<Cheque, Long> {

}
