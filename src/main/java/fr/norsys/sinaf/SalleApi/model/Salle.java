package fr.norsys.sinaf.SalleApi.model;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Salle {
	private Long idSalle;
	private String libelle;
	private Integer capacite;
	private String image;
	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", libelle=" + libelle + ", capacite=" + capacite + ", image=" + image
				+ "]";
	}
	

}
