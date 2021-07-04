package com.projet.boot.infrastructure.model;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLE_SEQUENCE")
	@SequenceGenerator(sequenceName = "S_ROLE", allocationSize = 1, name = "ROLE_SEQUENCE")
	@Column(name = "N_INDENT_ROLE")
	private Long id;

	@Column(name = "C_ROLE")
	private String code;

	@Column(name = "L_ROLE")
	private String libelle;
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Role() {
		super();
	}

	public Role(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
