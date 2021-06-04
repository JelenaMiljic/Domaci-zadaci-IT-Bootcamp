package domaciNiz;

import java.util.Scanner;

public class Niz1 {

	public static void main(String[] args) {
		/*1.	Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza koji su tipa int.
	Zatim niz proslediti metodi koja treba da proveri da li je niz palindrom ili nije.
 	Na standradnom izlazu obavestiti krajnjeg korisnika njemu razumljivim tekstom da li je unesen niz palindrom.
	Primer ucitanog niza koji je palindrom: 12 46 17 46 12
	Primer ucitanog niza koji nije palindrom: 12 46 17 12 64 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi duzinu niza: ");
		int duzina = sc.nextInt();
		
		int [] niz = new int[duzina];
		
				
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			int unetiBroj = sc.nextInt();
			
			niz [i] = unetiBroj;				
		}
		
		if(jePalindrom(niz)){
			System.out.println("Palindrom");
		} else {
			System.out.println("Nije Palindrom");
		}
		
	}

	public static boolean jePalindrom(int[] stariNiz) {
		int duzinaNiza = stariNiz.length - 1;

		for(int i=0; i<duzinaNiza;i++) {
			if(stariNiz[i] != stariNiz[duzinaNiza-i]) {
				return false;
			}
		}

		return true;
	}
}
