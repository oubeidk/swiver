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
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "FACTURE")
public class FactureAchat {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "FAC_ACHAT_SEQUENCE")
	@SequenceGenerator(sequenceName = "S_FAC_CHAT", allocationSize = 1, name = "FAC_ACHAT_SEQUENCE")	
	@Column(name = "N_IDENTI_FAC")
	private Long numero;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "D_DATE_FAC")
	private Date dateFacture;

	@Column(name = "DB_TOTAL_FAC")
	private Float total;

	@Column(name = "S_MA_CRE")
	private String matriculeCreateur;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "D_CRE_ENREG")
	private Date dateCreation;

	@Column(name = "S_MA_MOD")
	private String matriculeModificateur;

	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "D_MODIF_ENREG")
	private Date dateModification;

	public FactureAchat() {
		super();
	}

	public FactureAchat(Long numero, Date dateFacture, Float total, String matriculeCreateur, Date dateCreation,
			String matriculeModificateur, Date dateModification) {
		super();
		this.numero = numero;
		this.dateFacture = dateFacture;
		this.total = total;
		this.matriculeCreateur = matriculeCreateur;
		this.dateCreation = dateCreation;
		this.matriculeModificateur = matriculeModificateur;
		this.dateModification = dateModification;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
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
