package org.tarik.GestionRecrutement.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Experience {
	@Id
	private Long id;
	private String eType;
	@Embedded
	private Projet eProjet;
	@ManyToOne()
	private Candidat candidat;

}
