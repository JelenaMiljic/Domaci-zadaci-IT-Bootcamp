package domaciKlaseNasledjivanje;

public class Zivotinje {
	/* Zivotinje
U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica, poklasa.. 
Moze biti kicmenjak/beskicmenjak, moze biti i neko blize odredjivanje�), konkretan naziv i omiljenu hranu.
Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.
Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. 
Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
Ispisati bar jedno staniste.
Jednom sisaru zameniti boju dlake. */ 
	
	
	private String vrsta;
	private String naziv;
	private String omiljenaHrana;
	public Zivotinje(String vrsta, String naziv, String omiljenaHrana) {
	
		
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.omiljenaHrana = omiljenaHrana;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOmiljenaHrana() {
		return omiljenaHrana;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		 sb.append(vrsta);
		 sb.append(", ");
		 sb.append(naziv);
		 sb.append(", ");
		 sb.append(omiljenaHrana);
		 return sb.toString();
	
	} 
}
