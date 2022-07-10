package org.tarik.GestionRecrutement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Competence {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, nullable = false)
	private Long id;
	private String cmpLibelle;
	@OneToMany(mappedBy="competence")
	private List<CandidatCompetence> candidatCompetences=new ArrayList<>();
	public Competence(String cmpLibelle) {
		
		this.cmpLibelle = cmpLibelle;
	}
	
	

}
