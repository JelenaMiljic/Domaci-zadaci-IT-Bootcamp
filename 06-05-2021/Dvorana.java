package domaciKlase2;

public class Dvorana {

	private String naziv;
	private String grad;
	private int kapacitet;
	
	public Dvorana(String naziv, String grad, int kapacitet) {
		
		this.naziv = naziv;
		this.grad = grad;
		this.kapacitet = kapacitet;
	}
	public String getNaziv() {
		return naziv;
	}
	
	public String getGrad() {
		return grad;
	}
	
	public int getKapacitet() {
		return kapacitet;
	}
	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	@Override
	 public String toString() {
	 return "Dvorana " + naziv + ", " + grad + ", " + "kapacitet mesta: " + kapacitet;
	 }
	}
	

