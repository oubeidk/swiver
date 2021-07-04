package com.projet.boot.infrastructure.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TYPE_REG")
public class TypeReglement {

	@Id
	@Column(name = "C_TYPE_REG")
	private String code;

	@Column(name = "L_TYPE_REG")
	private String libelle;

	@Column(name = "S_MA_CRE")
	private String matriculeCreateur;

	@Temporal(TemporalType.DATE)
	@Column(name = "D_CRE_ENREG")
	private Date dateCreation;

	@Column(name = "S_MA_MOD")
	private String matriculeModificateur;

	@Temporal(TemporalType.DATE)
	@Column(name = "D_MODIF_ENREG")
	private Date dateModification;

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

	public String getMatriculeCreateur() {
		return matriculeCreateur;
	}

	public void setMatriculeCreateur(String matriculeCreateur) {
		this.matriculeCreateur = matriculeCreateur;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getMatriculeModificateur() {
		return matriculeModificateur;
	}

	public void setMatriculeModificateur(String matriculeModificateur) {
		this.matriculeModificateur = matriculeModificateur;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

}
