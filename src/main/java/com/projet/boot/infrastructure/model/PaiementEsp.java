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
@Table(name = "PAIEMENT_ESP")
public class PaiementEsp {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAIEMENT_ESP_SEQUENCE")
	@SequenceGenerator(sequenceName = "S_PAIEMENT_ESP", allocationSize = 1, name = "PAIEMENT_ESP_SEQUENCE")
	private Long id;

	private Float montant;

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

	public PaiementEsp(long id, float montant) {
		super();
		this.id = id;
		this.montant = montant;
	}

	public PaiementEsp() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
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

	public void setMontant(Float montant) {
		this.montant = montant;
	}

}
