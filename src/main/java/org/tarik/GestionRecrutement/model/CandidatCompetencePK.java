package org.tarik.GestionRecrutement.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class CandidatCompetencePK implements Serializable{
	private Candidat candidat;
	private Competence competence;
}
