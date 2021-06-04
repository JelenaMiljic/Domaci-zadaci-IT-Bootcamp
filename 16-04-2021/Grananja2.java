package grananja;

import java.util.Scanner;

public class Grananja2 {

	public static void main(String[] args) {
		// Prvi domaci zadatak od 15.4.2021. uraditi ponovo, koristeci grananja 
		//kako bismo se ogradili od nemogucih izracunavanja povrsina 
		//(kakvi celi brojevi moraju da budu visina, sirina i duzina?)

		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Unesite visinu: ");
		int visina = s.nextInt();
		if (visina <=0) {
		System.out.println("Nevalidna vrednost: ");
		}
		else {
			System.out.println("Unesite sirinu: ");
			int sirina = s.nextInt();
			if (sirina <=0) {
			System.out.println("Nevalidna vrednost: ");
			}
				else {
					System.out.println("Unesite duzinu: ");
					int duzina = s.nextInt();
					if (duzina<=0) {
					System.out.println("Nevalidna vrednost: ");
					}
						else {
							int povrsinazida1 = 2* visina * sirina;
							int povrsinazida2 = 2 * visina * duzina;
							int povrsinaplafona = sirina * duzina;
							int povrsinaokrecenesobe = povrsinazida1 + povrsinazida2 + povrsinaplafona;
			
							System.out.println("Povrsina okrecene sobe je: " + povrsinaokrecenesobe);
							}
					}
		   	}
		
	}
			
}
		
		


