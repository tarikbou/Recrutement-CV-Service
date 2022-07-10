package org.tarik.GestionRecrutement.model;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class NomComplet {
	private String nom;
	private String prenom;

}
