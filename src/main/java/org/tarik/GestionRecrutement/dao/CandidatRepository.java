package org.tarik.GestionRecrutement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tarik.GestionRecrutement.model.Candidat;
@Repository
public interface CandidatRepository extends  JpaRepository<Candidat, Long>{

}
