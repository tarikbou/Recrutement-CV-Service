package org.tarik.GestionRecrutement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tarik.GestionRecrutement.model.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {

}
