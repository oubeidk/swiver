package com.projet.boot.infrastructure.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author somap
 * 
 *         TABLE REFERENTIEL: ETAT DE REGLEMENT FACTURE
 *
 */
@Entity
@Table(name = "ETAT_REG_CLI")
public class EtatReglementClient {

	@Id
	@Column(name = "C_ETT_REG_CLI")
	private String code;

	@Column(name = "L_ETT_REG_CLI")
	private String libelle;

	@Column(name = "S_MA_CRE_CLI")
	private String matriculeCreateur;

	@Temporal(TemporalType.DATE)
	@Column(name = "D_CRE_ENREG_CLI")
	private Date dateCreation;

	@Column(name = "S_MA_MOD_CLI")
	private String matriculeModificateur;

	@Temporal(TemporalType.DATE)
	@Column(name = "D_MODIF_ENREG_CLI")
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
