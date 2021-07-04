package com.projet.boot.infrastructure.model;

import java.util.Date;
import java.util.Objects;
import java.util.Optional;

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

import com.projet.boot.infrastructure.dto.ChequeDto;

@Entity
@Table(name = "CHEQUE")
public class Cheque {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CHEQUE_SEQUENCE")
	@SequenceGenerator(sequenceName = "S_CHEQUE", allocationSize = 1, name = "CHEQUE_SEQUENCE")
	@Column(name = "N_INDENT_CHQ")
	private Long id;

	@Column(name = "V_NUM_CHQ")
	private String numero;

	@Column(name = "V_DOM_CHQ")
	private String domiciliation;

	@Column(name = "V_ORD_CHQ")
	private String ordre;

	@Column(name = "D_ECH_CHQ")
	private Date echeance;

	@Column(name = "F_MNT_CHQ")
	private Float montant;

	@Column(name = "S_MA_CRE_")
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

	public Cheque(Long id, String numero, String domiciliation, String ordre, Date echeance, Float montant,
			String matriculeCreateur, Date dateCreation, String matriculeModificateur, Date dateModification) {
		super();
		this.id = id;
		this.numero = numero;
		this.domiciliation = domiciliation;
		this.ordre = ordre;
		this.echeance = echeance;
		this.montant = montant;
		this.matriculeCreateur = matriculeCreateur;
		this.dateCreation = dateCreation;
		this.matriculeModificateur = matriculeModificateur;
		this.dateModification = dateModification;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDomiciliation() {
		return domiciliation;
	}

	public void setDomiciliation(String domiciliation) {
		this.domiciliation = domiciliation;
	}

	public String getOrdre() {
		return ordre;
	}

	public void setOrdre(String ordre) {
		this.ordre = ordre;
	}

	public Date getEcheance() {
		return echeance;
	}

	public void setEcheance(Date echeance) {
		this.echeance = echeance;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
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

	public Cheque() {
		super();
	}

	/**
	 * Class Mapper Cheque
	 * 
	 * @author somap
	 *
	 */
	public static class ChequeMapper {

		/**
		 * Dto object to model
		 * 
		 * @param in
		 * @return Cheque
		 */
		public static Optional<Cheque> dtoToModel(Optional<ChequeDto> in) {

			Cheque out = new Cheque();

			if (Objects.nonNull(in)) {

				out.setDateCreation(in.get().getDateCreation());
				out.setDateModification(in.get().getDateModification());
				out.setDomiciliation(in.get().getDomiciliation());
				out.setEcheance(in.get().getEcheance());
				out.setId(in.get().getId());
				out.setMontant(in.get().getMontant());
				out.setNumero(in.get().getNumero());
				out.setOrdre(in.get().getOrdre());
			}

			return Optional.of(out);
		}

		/**
		 * Cheque dto to model
		 * 
		 * @param in
		 * @return ChequeDto
		 */
		public static Optional<ChequeDto> modelToDto(Optional<Cheque> in) {

			ChequeDto out = new ChequeDto();

			if (Objects.nonNull(in)) {

				out.setDateCreation(in.get().getDateCreation());
				out.setDateModification(in.get().getDateModification());
				out.setDomiciliation(in.get().getDomiciliation());
				out.setEcheance(in.get().getEcheance());
				out.setId(in.get().getId());
				out.setMontant(in.get().getMontant());
				out.setNumero(in.get().getNumero());
				out.setOrdre(in.get().getOrdre());
			}

			return Optional.of(out);
		}

	}

}
