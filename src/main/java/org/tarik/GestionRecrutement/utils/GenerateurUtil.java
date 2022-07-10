package org.tarik.GestionRecrutement.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.tarik.GestionRecrutement.model.Candidat;

public class GenerateurUtil {

	public static byte[] generateFormaWordCV(Candidat candidat) throws IOException {
		try (XWPFDocument document = new XWPFDocument(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
			generateInformationGeneraleSection(document, candidat);
			generateFormationsSection(document, candidat);
			generateExperiencesSection(document, candidat);
			generateCompetencesesSection(document, candidat);
			document.write(out);
			return out.toByteArray();
		}

	}

	private static void generateInformationGeneraleSection(XWPFDocument document, Candidat candidat) {
		XWPFParagraph informationGeneraleTitle = document.createParagraph();
		XWPFRun runtitle = informationGeneraleTitle.createRun();
		runtitle.setText("Information Generale");
		runtitle.setFontSize(25);
		runtitle.addBreak();
		XWPFParagraph informationGenerale = document.createParagraph();
		XWPFRun run = informationGenerale.createRun();
		run.setText("Nom :");
		run.setText(candidat.getNomComplet().getNom());
		run.addBreak();
		run.setText("Prenom :");
		run.setText(candidat.getNomComplet().getPrenom());
                run.addBreak();
		run.setText("Adresse :  ");
                run.addBreak();
		run.setText("Numero :"+candidat.getAdresse().getNumeroAdresse());
		run.setText("Rue :"+candidat.getAdresse().getRue());
		run.setText("Ville :"+candidat.getAdresse().getVille());
		run.setText("Paye :"+candidat.getAdresse().getPaye());

		run.setFontSize(12);
		run.addBreak();
	};

	private static void generateFormationsSection(XWPFDocument document, Candidat candidat) {
		XWPFParagraph FormationsTitle = document.createParagraph();
		XWPFRun runtitle =FormationsTitle.createRun();
		runtitle.setText("Formations");
		runtitle.setFontSize(25);
		runtitle.addBreak();
	};

	private static void generateExperiencesSection(XWPFDocument document, Candidat candidat) {
		XWPFParagraph ExperiencesTitle = document.createParagraph();
		XWPFRun runtitle =ExperiencesTitle.createRun();
		runtitle.setText("Experiences");
                runtitle.setFontSize(25);
	};

	private static void generateCompetencesesSection(XWPFDocument document, Candidat candidat) {
		XWPFParagraph CompetencesesTitle = document.createParagraph();
		XWPFRun runtitle =CompetencesesTitle.createRun();
		runtitle.setText("Competenceses");
                runtitle.setFontSize(25);
	};

}
