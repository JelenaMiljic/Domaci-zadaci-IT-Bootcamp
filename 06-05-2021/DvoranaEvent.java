package domaciKlase2;

import java.util.ArrayList;
import java.util.List;


public class DvoranaEvent {
	

	public static void main(String[] args) {

						
	Dvorana d1 = new Dvorana("Stark", "Beograd", 20000);
	Dvorana d2 = new Dvorana("Sava Centar", "Beograd", 3500);
	Dvorana d3 = new Dvorana("Spens", "Novi Sad", 3600);
	Dvorana d4 = new Dvorana("Ledena Dvorana Pionir", "Beograd", 1200);
	
	System.out.println(d4.toString());
	
	Event e1 = new Event("10.05.2021.godine, u 20.00 casova", d1, "Koncert");
	Event e2 = new Event("20.06.2021.godine, 21.00 cas", d2, "Filmski program");
	Event e3 = new Event("15.07.2021.godine u 18.00 casova", d3, "Utakmica");
	
	List<Dvorana>listaDvorana= new ArrayList<Dvorana>();
	
	System.out.println(e1.toString());
	
	 System.out.println(e2.toString());
	 
	 e2.setMesto(d2);
	 
	 e2.setDatum("11.3.2022.");
	 
	 System.out.println(e2.toString());
	 

		
	
	
	}
	
}
