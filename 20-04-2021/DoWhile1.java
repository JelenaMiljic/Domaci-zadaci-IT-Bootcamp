package doWhile;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// Napisati program koji ce omoguciti Peri da unese sa koliko novca raspolaze. 
		//On moze da kupuje sve dok mu ne ostane samo 89 dinara jer mu toliko novca treba da kupi BUSPLUS kartu 
		//i vrati se kuci sa novogodisnjim poklonima. 
		//Pera treba  da unosi pojedinacne cene poklona, 
		//a program treba da ga obavesti kada potrosi sav predvidjeni novac, 
		//to jest kada za sledeci poklon vise nema kinte.
		int ukupnoNovca = 0;
				
		System.out.println("Unesi kolicinu novca sa kojom raspolazes:");
		Scanner sc = new Scanner (System.in);
		ukupnoNovca = sc.nextInt();
		
		System.out.println("Trenutno imam " + ukupnoNovca);
		
		do {
			System.out.println("Kupi poklon za:");
			
			int cena = sc.nextInt();
			
			if(ukupnoNovca - cena < 89) {
				System.out.println("Nemam dovoljno novca");
			} else {
			
				ukupnoNovca = ukupnoNovca - cena;
			
				System.out.println("Ostalo mi je:" + ukupnoNovca);
			}
						
		} while (ukupnoNovca > 89); 
		
		System.out.println("Ostalo je dovoljno za busplus");

	}
}
