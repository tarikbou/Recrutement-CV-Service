package org.tarik.GestionRecrutement.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Adresse {
	@Column(nullable = true)
	private int numeroAdresse;
	private String rue;
	private String ville;
	private String paye;

}
