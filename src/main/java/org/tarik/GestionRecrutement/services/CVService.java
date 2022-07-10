package org.tarik.GestionRecrutement.services;

import java.io.IOException;

import org.tarik.GestionRecrutement.dto.entitesDTO.CvDTO;

public interface CVService {

	CvDTO generatecv(Long idCandidat) throws IOException;

}
