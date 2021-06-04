package domaciKlaseNasledjivanje;

import java.util.List;

public class Staniste {
	/* Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. 
Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi. */

	private List<Zivotinje>zivotinja;
	private String nazivStanista;
	
	public Staniste (List<Zivotinje> zivotinja, String nazivStanista) {
		
		this.zivotinja=zivotinja;
		this.nazivStanista=nazivStanista;
	}

	public List<Zivotinje> getZivotinja() {
		return zivotinja;
	}

	public void setZivotinja(List<Zivotinje> zivotinja) {
		this.zivotinja = zivotinja;
	}

	public String getNazivStanista() {
		return nazivStanista;
	}

	public void setNazivStanista(String nazivStanista) {
		this.nazivStanista = nazivStanista;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		 sb.append(zivotinja);
		 sb.append(" ");
		 sb.append(nazivStanista);
		 return sb.toString();
	}
	
	
	
}
