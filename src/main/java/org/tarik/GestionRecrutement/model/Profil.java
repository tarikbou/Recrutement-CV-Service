package org.tarik.GestionRecrutement.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
public class Profil {
	private String typeProfil;
	@Column(nullable = true)
	private int  nbrAnneesExp;
	private String domain;

}
