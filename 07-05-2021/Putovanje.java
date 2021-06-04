package domaciListe;

import java.util.List;

public class Putovanje {

	// Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu
	// putnika.

	private String destinacija;
	private double cena;
	private List<Putnik> putnici;

	public Putovanje(String destinacija, double cena, List<Putnik> putnici) {
		this.destinacija = destinacija;
		this.cena = cena;
		this.putnici = putnici;
	}

	public String getDestinacija() {
		return destinacija;
	}

	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public List<Putnik> getPutnici() {
		return putnici;
	}

	public void setPutnici(List<Putnik> putnici) {
		this.putnici = putnici;
	}
}