package org.tarik.GestionRecrutement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tarik.GestionRecrutement.model.CandidatCompetence;
import org.tarik.GestionRecrutement.model.CandidatCompetence.CandidatCompetenceId;

public interface CandidatCompetenceRepository extends JpaRepository<CandidatCompetence,CandidatCompetenceId> {

}
