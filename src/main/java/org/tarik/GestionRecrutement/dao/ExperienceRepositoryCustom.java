package org.tarik.GestionRecrutement.dao;

import java.util.List;

import org.tarik.GestionRecrutement.model.Experience;

public interface ExperienceRepositoryCustom {
	public List<Experience> getAllExperienceByCandidat(Long candidatId);
}
