package org.tarik.GestionRecrutement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Candidat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, nullable = false)
	private Long id;
	@Embedded
	private NomComplet nomComplet = new NomComplet();
	private String sex;
	@OneToMany(mappedBy = "candidat", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Contact> contact = new ArrayList<>();
	@Embedded
	private Adresse adresse = new Adresse();
	@Embedded
	private Profil profil = new Profil();
	@OneToMany(mappedBy = "candidat", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Experience> listExperiences = new ArrayList<Experience>();
	@OneToMany(mappedBy = "candidat", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Formation> listFormations = new ArrayList<Formation>();
	@OneToMany(mappedBy = "candidat", cascade = CascadeType.REMOVE)
	private List<CandidatCompetence> candidatCompetences = new ArrayList<CandidatCompetence>();

}
