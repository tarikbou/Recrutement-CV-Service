package org.tarik.GestionRecrutement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Formation {
	@Id
	private Long id;
	private String fType;
	private String etablisement;
	private String deplome;
	@ManyToOne
	private Candidat candidat;

}
