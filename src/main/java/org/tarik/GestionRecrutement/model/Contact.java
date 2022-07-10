package org.tarik.GestionRecrutement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
public class Contact {
	@Id 
	private long cId;
	private String adresseMail;
	private String numTel;
	@ManyToOne
	private Candidat candidat;
}
