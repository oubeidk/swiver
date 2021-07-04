package com.projet.boot.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.boot.infrastructure.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long>{

}
