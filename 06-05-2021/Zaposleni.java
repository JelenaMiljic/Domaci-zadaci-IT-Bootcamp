package domaciKlasee2;

public class Zaposleni {

	private String ime;
	private String prezime;
	private String pozicija;
	private double zarada;
	
	public Zaposleni( String ime, String prezime) {
		
		this.ime = ime;
		this.prezime = prezime;
		
	}

		public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public double getZarada() {
		return zarada;
	}

	public void setZarada(double zarada) {
		this.zarada = zarada;
	}
	@Override
	 public String toString() {
	 return ime + "_"+ prezime + ": " + pozicija + "( " + zarada + ")";
	 }
	}