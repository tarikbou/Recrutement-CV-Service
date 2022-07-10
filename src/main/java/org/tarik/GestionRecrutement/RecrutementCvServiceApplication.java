package org.tarik.GestionRecrutement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tarik.GestionRecrutement.dao.CandidatCompetenceRepository;
import org.tarik.GestionRecrutement.dao.CandidatRepository;
import org.tarik.GestionRecrutement.dao.CompetenceRepository;
import org.tarik.GestionRecrutement.model.Candidat;
import org.tarik.GestionRecrutement.model.CandidatCompetence;
import org.tarik.GestionRecrutement.model.Competence;

@SpringBootApplication
public class RecrutementCvServiceApplication implements CommandLineRunner {
	@Autowired
	CompetenceRepository competenceRepo;
	@Autowired
	CandidatRepository candidatRepo;
	@Autowired
	CandidatCompetenceRepository candidatCompetencerepo;

	public static void main(String[] args) {
		SpringApplication.run(RecrutementCvServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Competence comp1=new Competence("JAVA");
		// competenceRepo.save(comp1);

//		Competence comp2=new Competence("UML");
//		Competence comp3=new Competence("SQL");
//		Competence comp4=new Competence("Hibernate");4

		Candidat c1 = new Candidat();
		c1.getNomComplet().setNom("candidat1");
		c1.getNomComplet().setPrenom("prenom1");
		c1.setSex("homme");
		Candidat c2 = new Candidat();
		c2.getNomComplet().setNom("candidat2");
		c2.getNomComplet().setPrenom("prenom2");
		c2.setSex("femme");
		Candidat c3 = new Candidat();
		c3.getNomComplet().setNom("candidat3");
		c3.getNomComplet().setPrenom("prenom3");
		c3.setSex("homme");
		Candidat c4 = new Candidat();
		c4.getNomComplet().setNom("candidat4");
		c4.getNomComplet().setPrenom("prenom4");
		c4.setSex("femme");
//		c1.getAdresse().setNumeroAdresse(10);
//		c1.getAdresse().setPaye("france");
//		c1.getAdresse().setRue("rue");
//		c1.getAdresse().setVille("ville");
		candidatRepo.save(c1);
		candidatRepo.save(c2);
		candidatRepo.save(c3);
		candidatRepo.save(c4);

		// CandidatCompetence cComp= new CandidatCompetence(c1,comp1,5);
//		cComp.setCandidat(c1);
//		cComp.setCompetence(comp1);
//		cComp.setNiveau(5);
//		c1.getCandidatCompetences().add(cComp);
//		competenceRepo.save(comp1);

//		competenceRepo.save(comp1);
//		competenceRepo.save(comp2);
//		competenceRepo.save(comp3);
//		competenceRepo.save(comp4);
		// Candidat c1=new Candidat();
		// CandidatCompetence cComp=new CandidatCompetence(c1,comp1,5);

		// candidatCompetencerepo.save(cComp);

		// candidatCompetencerepo.save(cComp);
		// candidatRepo.save(c1);
		// c1.getCandidatCompetences().add(cComp);

	}

}
