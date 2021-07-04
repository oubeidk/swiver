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
@Table(name = "REGLEMENT_CLI")
public class ReglementClient {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REGLEMENT_SEQUENCE")
	@SequenceGenerator(sequenceName = "S_REGLEMENT", allocationSize = 1, name = "REGLEMENT_SEQUENCE")
	@Column(name = "N_INDENT_REG")
	private Long id;

	@Column(name = "D_REG")
	private Date dateReglement;
	
	@Column(name = "V_TYPE_REG")
	private String type;

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

	public ReglementClient(Long id, Date dateReglement, String type, String matriculeCreateur, Date dateCreation,
			String matriculeModificateur, Date dateModification) {
		super();
		this.id = id;
		this.dateReglement = dateReglement;
		this.type = type;
		this.matriculeCreateur = matriculeCreateur;
		this.dateCreation = dateCreation;
		this.matriculeModificateur = matriculeModificateur;
		this.dateModification = dateModification;
	}

	public ReglementClient() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateReglement() {
		return dateReglement;
	}

	public void setDateReglement(Date dateReglement) {
		this.dateReglement = dateReglement;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
