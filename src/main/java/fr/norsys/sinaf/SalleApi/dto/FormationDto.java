package fr.norsys.sinaf.SalleApi.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FormationDto {
	private Long idFormation;
	private String intitule;
	private String etat;
	private LocalDate dateDebut;
	private LocalDate dateFin;

}
