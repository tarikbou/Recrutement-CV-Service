package org.tarik.GestionRecrutement.controllers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tarik.GestionRecrutement.dto.entitesDTO.CandidatDTO;
import org.tarik.GestionRecrutement.dto.entitesDTO.CvDTO;
import org.tarik.GestionRecrutement.services.CVService;
import org.tarik.GestionRecrutement.services.CandidatService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CandidatController {

	@Autowired
	@Qualifier("candidatservice")
	CandidatService candidatService;
	@Autowired
	@Qualifier("cvservice")
	CVService cvService;

	@GetMapping("/candidats")
	public List<CandidatDTO> all() {
		return candidatService.getCandidats();

	}

	@PostMapping("/candidats")
	public CandidatDTO addCandidat(@RequestBody CandidatDTO candidatDTO) {
		return candidatService.createCandidat(candidatDTO);

	}

	@PutMapping("/candidats/{id}")
	public CandidatDTO updateCandidat(@RequestBody CandidatDTO cvdto, @PathVariable Long id) {

		return null;

	}

	@DeleteMapping("/candidats/{id}")
	public void deleteCandidat(@PathVariable Long id) {
		candidatService.deleteCandidat(id);
	}

	@GetMapping("/candidats/{id}")
	public CandidatDTO getCandidat(@PathVariable Long id) {
		return candidatService.getCandidat(id);

	}

	@GetMapping("/candidats/{id}/Downloadcv")
	public ResponseEntity<Resource> getCVWord(@PathVariable Long id) throws IOException {
		CvDTO result = cvService.generatecv(id);
		ByteArrayInputStream in = new ByteArrayInputStream(result.getData());
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=" + result.getNameFile());

		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));
	}

}
