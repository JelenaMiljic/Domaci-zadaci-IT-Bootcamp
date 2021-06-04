package domaciListe;

import java.util.ArrayList;
import java.util.List;

public class PutovanjeOdmor {

	public static void main(String[] args) {

		Putnik p1 = new Putnik("Jeca", "Jelic", "123456");
		Putnik p2 = new Putnik("Mila", "Milic", "789456");
		Putnik p3 = new Putnik("Petar", "Petrovic", "445566");
		Putnik p4 = new Putnik("Ana", "Ivic", "112233");
		
		List<Putnik> putnici1 = new ArrayList<Putnik>();
		List<Putnik> putnici2 = new ArrayList<Putnik>();
		
		putnici1.add(p1);
		putnici1.add(p2);
		putnici2.add(p3);
		putnici2.add(p4);
		
		Putovanje put1 = new Putovanje("Moskva", 750.00, putnici1);
		Putovanje put2 = new Putovanje("Sankt Peterburg", 920.00, putnici2);
		Putovanje pu3 = new Putovanje("Madrid", 650, putnici1);
		
		List<Putovanje> ponuda = new ArrayList<Putovanje>();
		
		ponuda.add(put1);
		ponuda.add(put2);
		
		put2.setCena(880.00);
		
		ponuda.remove(0);
		
		ponuda.get(0).getPutnici().remove(0);
		
		for (int i = 0; i < ponuda.get(0).getPutnici().size(); i++) {

			System.out.println(ponuda.get(0).getPutnici().get(i).getIme());
		}
	}
}