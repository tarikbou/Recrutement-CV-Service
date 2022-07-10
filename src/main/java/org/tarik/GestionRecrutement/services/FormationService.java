package org.tarik.GestionRecrutement.services;

import java.util.List;

import org.tarik.GestionRecrutement.dto.entitesDTO.FormationDTO;

public interface FormationService {
	public FormationDTO createFormation(FormationDTO formationDTO);

	public FormationDTO updateFormation(Long formationId, FormationDTO formationDTO);

	public void deleteFormation(Long formationId);

	public List<FormationDTO> getAllFormationByCandidate(Long CandidatId);

}
