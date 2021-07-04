package com.projet.boot.infrastructure.model;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "FOURNISSEUR")

public class Fournisseur  {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOURNISSEUR_SEQUENCE")
	@SequenceGenerator(sequenceName = "S_FRNT", allocationSize = 1, name = "FOURNISSEUR_SEQUENCE")
	@Column(name = "N_INDENT_FRN")
	private Long id;
	
	@Column(name = "C__FRN")
	private String code;

	@Column(name = "L_FRN")
	private String libelle;
	
	@Column(name = "V_TEL_FRN")
	private String tel;

	@Column(name = "V_NUM_FAX_FRN")
	private String numFax;
	
	@Column(name = "V_EMAIL_FRN")
	private String email;
	
	@Column(name = "V_ADRESSE_FRN")
	private String adresse;

	@Column(name = "V_MATRICULE_FISC_FRN")
	private String matriculeFiscal;
	
	@Column(name = "S_MA_CRE_FRN")
	private String matriculeCreateur;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "D_CRE_ENREG_FRN")
	private Date dateCreation;

	@Column(name = "S_MA_MOD_FRN")
	private String matriculeModificateur;

	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "D_MODIF_ENREG_FRN")
	private Date dateModification;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNumFax() {
		return numFax;
	}

	public void setNumFax(String numFax) {
		this.numFax = numFax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMatriculeFiscal() {
		return matriculeFiscal;
	}

	public void setMatriculeFiscal(String matriculeFiscal) {
		this.matriculeFiscal = matriculeFiscal;
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

	public Fournisseur(Long id, String code, String libelle, String tel, String numFax, String email, String adresse,
			String matriculeFiscal, String matriculeCreateur, Date dateCreation, String matriculeModificateur,
			Date dateModification) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.tel = tel;
		this.numFax = numFax;
		this.email = email;
		this.adresse = adresse;
		this.matriculeFiscal = matriculeFiscal;
		this.matriculeCreateur = matriculeCreateur;
		this.dateCreation = dateCreation;
		this.matriculeModificateur = matriculeModificateur;
		this.dateModification = dateModification;
	}

	public Fournisseur() {
		super();
	}

	
	
}
