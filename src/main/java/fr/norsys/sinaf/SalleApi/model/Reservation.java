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
public class Reservation {
	
	private Long idReservation;
	private String commentaire;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private Salle salle;
	private Motif motif;
	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", commentaire=" + commentaire + ", dateDebut="
				+ dateDebut + ", dateFin=" + dateFin + ", salle=" + salle + ", motif=" + motif + "]";
	}

}
