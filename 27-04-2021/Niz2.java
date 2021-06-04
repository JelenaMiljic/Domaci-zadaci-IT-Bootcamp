package domaciNiz;

import java.util.Scanner;

public class Niz2 {

	public static void main(String[] args) {
		/*Napisati program koji izracunava proizvod elemenata niza tipa int,  
		 * koji su veci od njihovog indeksa. Za unos niza i za proizvod koristiti zasebno metode. 
		 * Duzina niza i unos niza ucitavaju se sa standardnog ulaza.
			Primer ucitanog niza: 3 7 1 4 2 5
			                      0 1 2 3 4 5
			Primer izracunatog proizvoda: 84 */

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Unesi duzinu niza: ");
		int duzina = sc.nextInt();
				
		int [] niz = new int[duzina];
		
		int proizvod = 1;
		
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			int unetiBroj = sc.nextInt();
			
			niz [i] = unetiBroj;
			
			if (unetiBroj > i) {
				proizvod = proizvod * unetiBroj;
			} 
			
		}
		
		System.out.println("Ukupan proizvod je: " + proizvod);
		
						
			}
}
