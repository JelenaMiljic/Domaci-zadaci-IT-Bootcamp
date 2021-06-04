package vezbanje1;

import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {
		// Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
			//0 - Izlaz iz programa (zatvaranje kase)
			//1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
			//2 - naplata racuna
			//Ukoliko korisnik unese opciju 0 program se zavrsava.
		//Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
		//Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
		//Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna 
		//i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna 
		//ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.

		Scanner sc = new Scanner (System.in);
		int izbor = 0;
		int racun = 0;
		
		do {
			System.out.println("0 - Izlaz iz programa (zatvaranje kase)");
			System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
			System.out.println("2 - naplata racuna");
			
			System.out.println("Izaberite opciju");
			izbor = sc.nextInt();
					
			switch (izbor) {
			case 0:
				System.out.println("Dovidjenja");
				break;
			case 1:
				System.out.println("Unesi cenu proizvoda");
				int n = sc.nextInt();
				racun = racun + n;
				System.out.println("Racun je: " + racun);
				break;
			case 2:
				System.out.println("Unesi kolicinu novca za naplatu");
				int naplata = sc.nextInt();
				if (naplata<racun) {
					System.out.println("Greska");		
				} else {
					System.out.println("Kusur je: " + (naplata - racun));	
					racun = 0;
					System.out.println("Racun je: " + racun);
				}
				
				break;
								
				}
			
		} while(izbor != 0);
				

		}
	}
