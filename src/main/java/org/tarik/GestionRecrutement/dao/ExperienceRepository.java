package org.tarik.GestionRecrutement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tarik.GestionRecrutement.model.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {

}
