package sintakse;

import java.util.Scanner;

public class Sintaksa1 {

	public static void main(String[] args) {
		//Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije, 
		//tako sto se ivice prostorije ucitavaju preko konzole. 
		//(za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite visinu: ");
		int visina = s.nextInt();
		
		
		System.out.println("Unesite sirinu: ");
		int sirina = s.nextInt();
		
		System.out.println("Unesite duzina: ");
		int duzina = s.nextInt();
		
		int povrsinazida1 = 2* visina * sirina;
		int povrsinazida2 = 2 * visina * duzina;
		int povrsinaplafona = sirina * duzina;
		int povrsinaokrecenesobe = povrsinazida1 + povrsinazida2 + povrsinaplafona;
		
		System.out.println("Povrsina okrecene sobe je: " + povrsinaokrecenesobe);
		
		
	}
}
