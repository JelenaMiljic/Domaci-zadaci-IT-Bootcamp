package domaciKlaseNasledjivanje;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		/* Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
		Ispisati bar jedno staniste.
		Jednom sisaru zameniti boju dlake. */  
		
				
		Sisari s = new Sisari( "Kengur", "Kengurska trava", "siva", 4);
		Sisari s2 = new Sisari( "Lav", "Gazela", "Svetlo braon", 4);
		System.out.println(s2.toString());
		
		s2.setBojaDlake("tamno smedja");
		System.out.println(s2.getBojaDlake());

		
		Ribe r = new Ribe("Pastrmka", "Sargarepa", "Slatka voda", "Karlicna peraja");
		Ribe r1 = new Ribe( "Losos", "Insekti", "Morska", "Trbusna, ledjna");
		System.out.println(r.toString());

		List <Zivotinje>zivotinja = new ArrayList();
		zivotinja.add(s);
		zivotinja.add(r);
		zivotinja.add(r1);
		
		List <Zivotinje>zivotinja2 = new ArrayList();
		zivotinja2.add(s2);
		
	Staniste st = new Staniste(zivotinja2, "Afrika");
	System.out.println(st.toString());
	
	
	
	}

}
