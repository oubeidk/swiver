package com.projet.boot.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.boot.infrastructure.model.EtatFacture;

@Repository

public interface Etat_factureRepository extends JpaRepository<EtatFacture, Long>{

}
