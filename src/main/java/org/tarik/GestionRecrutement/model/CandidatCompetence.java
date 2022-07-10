package org.tarik.GestionRecrutement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidatCompetence implements Serializable {
	@EmbeddedId
	CandidatCompetenceId id;

	@ManyToOne
	@JoinColumn(name = "fk_candidat", insertable = false, updatable = false)
	private Candidat candidat;

	@ManyToOne
	@JoinColumn(name = "fk_competence", insertable = false, updatable = false)
	private Competence competence;
	@Range(min = 1, max = 10)
	private int Niveau;

	public CandidatCompetence(Candidat candidat, Competence competence, @Range(min = 1, max = 10) int niveau) {

		this.id = new CandidatCompetenceId(candidat.getId(), competence.getId());

		this.candidat = candidat;
		this.competence = competence;
		Niveau = niveau;
	}

	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	public static class CandidatCompetenceId implements Serializable {
		@Column(name = "fk_candidat")
		protected Long candidatId;

		@Column(name = "fk_competence")
		protected Long competenceId;

	}

}
