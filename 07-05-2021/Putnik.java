package domaciListe;

public class Putnik {
	
	/*  Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu putnika. Putnici imaju ime, prezime i broj pasosa.
U glavnom programu se igrati i testirati napisane klase.
Obavezni deo: napraviti bar 3 razlicita putovanja. Po zelji staviti putovanja u listu koja se zove ponuda. 
Jednom putovanju bar promeniti cenu aranzmana. 
Sa putovanja izbaciti jednog od putnika.
Neobavezni: vas slobodan izbor u skladu sa tekstom zadatka
*/

	private String ime;
	private String prezime;
	private String brojPasosa;
	
	
	public Putnik(String ime, String prezime, String brojPasosa) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.brojPasosa = brojPasosa;
	}


	public String getBrojPasosa() {
		return brojPasosa;
	}


	public void setBrojPasosa(String brojPasosa) {
		this.brojPasosa = brojPasosa;
	}


	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}
	
	
}
