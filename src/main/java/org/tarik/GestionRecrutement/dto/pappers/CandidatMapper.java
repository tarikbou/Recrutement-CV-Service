package org.tarik.GestionRecrutement.dto.pappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.tarik.GestionRecrutement.dto.entitesDTO.CandidatDTO;
import org.tarik.GestionRecrutement.model.Candidat;

@Mapper(componentModel = "spring")
public interface CandidatMapper {
	CandidatMapper INSTANCE = Mappers.getMapper(CandidatMapper.class);

	@Mappings({ @Mapping(target = "id", source = "entity.id"),
			@Mapping(target = "nom", source = "entity.nomComplet.nom"),
			@Mapping(target = "prenom", source = "entity.nomComplet.prenom"),
			@Mapping(target = "sex", source = "entity.sex"),
			@Mapping(target = "numeroAdresse", source = "entity.adresse.numeroAdresse"),
			@Mapping(target = "rue", source = "entity.adresse.rue"),
			@Mapping(target = "ville", source = "entity.adresse.ville"),
			@Mapping(target = "paye", source = "entity.adresse.paye"),
			@Mapping(target = "typeProfil", source = "entity.profil.typeProfil"),
			@Mapping(target = "nbrAnneesExp", source = "entity.profil.nbrAnneesExp"),
			@Mapping(target = "domain", source = "entity.profil.domain") })

	CandidatDTO candidatToCandidatDTO(Candidat entity);

	@Mappings({ @Mapping(target = "id", source = "dto.id"),
			@Mapping(target = "nomComplet.nom", source = "dto.nom"),
			@Mapping(target = "nomComplet.prenom", source = "dto.prenom"),
			@Mapping(target = "adresse.numeroAdresse", source = "dto.numeroAdresse"),
			@Mapping(target = "adresse.rue", source = "dto.rue"),
			@Mapping(target = "adresse.ville", source = "dto.ville"),
			@Mapping(target = "adresse.paye", source = "dto.paye"),
			@Mapping(target = "profil.typeProfil", source = "dto.typeProfil"),
			@Mapping(target = "profil.nbrAnneesExp", source = "dto.nbrAnneesExp"),
			@Mapping(target = "profil.domain", source = "dto.domain") })
	Candidat candidatDTOtoCandidat(CandidatDTO dto);
}
