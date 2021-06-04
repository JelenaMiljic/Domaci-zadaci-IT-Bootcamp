package grananja;


public class Grananja3 {

	public static void main(String[] args) {
		// Napisati program koji na osnovu 
		// unetog naziva meseca ispisuje koliko ima meseci u godini 
		// koji pocinju na to slovo(na taj glas) - za resavanje ovog zadatka koristiti switch
	
				
	
	String mesec = "Januar";
	
	switch (mesec) {
	case "januar":
	case "jun":
	case "jul":
	case "Januar":
	case "Jun":
	case "Jul":
		System.out.println("Broj meseci koji imaju isto pocetno slovo: 3");
	break;
	case "mart":
	case "maj":
	case "april":
	case "avgust":
	case "Mart":
	case "Maj":
	case "April":
	case "Avgust":
		System.out.println("Broj meseci koji imaju isto pocetno slovo: 2");
	break;
	case "februar":
	case "septembar":
	case "oktobar":
	case "novembar":
	case "decembar":
	case "Februar":
	case "Septembar":
	case "Oktobar":
	case "Novembar":
	case "Decembar":
		
		System.out.println("Broj meseci koji imaju isto pocetno slovo: 1");
	
	}
	}	
}
