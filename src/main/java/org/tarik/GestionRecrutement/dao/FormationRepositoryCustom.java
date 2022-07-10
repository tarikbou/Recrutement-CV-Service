package org.tarik.GestionRecrutement.dao;

import java.util.List;

import org.tarik.GestionRecrutement.model.Formation;

public interface FormationRepositoryCustom {
	public List<Formation> getAllFormationByCandidat(Long candidatId);

}
