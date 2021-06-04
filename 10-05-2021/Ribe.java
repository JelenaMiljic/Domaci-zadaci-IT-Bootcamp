package domaciKlaseNasledjivanje;

public class Ribe extends Zivotinje {
	/* Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka,
	 * slana voda) i vrsta peraja.*/

	private String vrstaVode;
	private String peraja;

	public Ribe(String naziv, String omiljenaHrana, String vrstaVode, String peraja) {
		super("Kicmenjaci", naziv, omiljenaHrana);

		this.vrstaVode = vrstaVode;
		this.peraja = peraja;
	}

	public String getVrstaVode() {
		return vrstaVode;
	}

	public void setVrstaVode(String vrstaVode) {
		this.vrstaVode = vrstaVode;
	}
	public String getPeraja() {
		return peraja;
	}
	public void setPeraja(String peraja) {
		this.peraja = peraja;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getVrsta());
		sb.append(", ");
		sb.append(getNaziv());
		sb.append(", ");
		sb.append(getOmiljenaHrana());
		sb.append(", ");
		sb.append(vrstaVode);
		sb.append(", ");
		sb.append(peraja);
		return sb.toString();

	}
}
