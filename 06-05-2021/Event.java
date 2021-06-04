package domaciKlase2;

public class Event {
//Napraviti klasu Event koja sadrzi podatke o vremenu, dvorani u kojoj se dogadjaj organizuje i tip (koncert, utakmica, vencanje…)
//Napraviti klasu Dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se nalazi i kapacitetu (broju mesta).
//Uvezati ove klase i u glavnom programu se igrati sa njima.

	private String datum;
	private Dvorana mesto;
	private String tipEventa;
	
	public Event(String datum, Dvorana mesto, String tipEventa) {
		this.datum =datum;
		this.mesto = mesto;
		this.tipEventa = tipEventa;
	}
	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}
	public Dvorana getMesto() {
        return mesto;
    }

    public void setMesto(Dvorana mesto) {
        this.mesto = mesto;
    }

    public String getTipEventa() {
        return tipEventa;
    }

    public void setTipEventa(String tipEventa) {
        this.tipEventa = tipEventa;
    }
    @Override
    public String toString() {
        return "Event{" +
                "datum='" + datum + '\'' +
                ", mesto=" + mesto +
                ", tip dogadjaja='" + tipEventa + '\'' +
                '}';
    }
}



	