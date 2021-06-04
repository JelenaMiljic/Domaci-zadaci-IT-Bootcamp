package domaciKlasee2;

public class Firma {

	private String naziv;
	private String sediste;
	private String pib;
	private Zaposleni [] zaposleni;
	
	public Firma(String naziv, String sediste, String pib, Zaposleni[] zaposleni) {
		
		this.naziv = naziv;
		this.sediste = sediste;
		this.pib = pib;
		this.zaposleni = zaposleni;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSediste() {
		return sediste;
	}
	public String getPib() {
		return pib;
	}
	public Zaposleni[] getZaposleni() {
		return zaposleni;
	}
	
	@Override
	 public String toString() {
	 StringBuilder sb = new StringBuilder();
	 sb.append(getNaziv());
	 sb.append(" , PIB: ");
	 sb.append(getPib());
	 sb.append("\n");
	 sb.append("Zaposleni: ");
	 sb.append(ispisZaposleni(zaposleni));
	 return sb.toString();
	 }
	 public String ispisZaposleni(Zaposleni[] zaposleni){ // niz je takodje slozena struktura, i zato pravimo novu metodu za ispis
		 
	 StringBuilder sb = new StringBuilder();
	 
	 for (int i = 0; i<zaposleni.length; i++){
	 sb.append("\n");
	 sb.append(zaposleni[i].toString());
	 } return sb.toString();
	 }
	}