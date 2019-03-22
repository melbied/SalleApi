package fr.norsys.sinaf.SalleApi.model;


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
public class Motif {
	@Override
	public String toString() {
		return "Motif [idMotif=" + idMotif + ", libelleMotif=" + libelleMotif + "]";
	}
	private Long idMotif;
	private String libelleMotif;
}
