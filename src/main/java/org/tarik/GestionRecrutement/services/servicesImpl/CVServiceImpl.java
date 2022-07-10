package org.tarik.GestionRecrutement.services.servicesImpl;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tarik.GestionRecrutement.dao.CandidatRepository;
import org.tarik.GestionRecrutement.dto.entitesDTO.CvDTO;
import org.tarik.GestionRecrutement.model.Candidat;
import org.tarik.GestionRecrutement.services.CVService;
import org.tarik.GestionRecrutement.utils.GenerateurUtil;

@Service("cvservice")
public class CVServiceImpl implements CVService {
	@Autowired
	CandidatRepository candidatRepo;

	@Override
	public CvDTO generatecv(Long id) throws IOException {
		Optional<Candidat> candidat = candidatRepo.findById(id);
		CvDTO cvDTO = new CvDTO();
		cvDTO.setData(GenerateurUtil.generateFormaWordCV(candidat.get()));
		StringBuilder sb = new StringBuilder();
		sb.append("CV_");
		sb.append(candidat.get().getNomComplet().getNom());
		sb.append("-");
		sb.append(candidat.get().getNomComplet().getPrenom());
		sb.append(".Docx");

		cvDTO.setNameFile(sb.toString());
		return cvDTO;
	}

}
