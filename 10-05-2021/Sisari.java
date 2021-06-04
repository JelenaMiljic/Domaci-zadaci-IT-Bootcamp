package domaciKlaseNasledjivanje;

public class Sisari extends Zivotinje{

	/* Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu */

	private String bojaDlake;
	private int brojNogu;
	
	public Sisari(String naziv, String omiljenaHrana, String bojaDlake, int brojNogu) {
		super("Kicmenjaci", naziv, omiljenaHrana);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public int getBrojNogu() {
		return brojNogu;
	}

	public void setBrojNogu(int brojNogu) {
		this.brojNogu = brojNogu;
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
	 sb.append(bojaDlake);
	 sb.append(", ");
	 sb.append(brojNogu);
	 return sb.toString();
	
}
	
}
