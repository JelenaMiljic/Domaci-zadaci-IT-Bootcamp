package projekatIzadaci;

import java.util.Scanner;

public class NizRastuce {

	public static void main(String[] args) {
		/* 7.	Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
		Primer1 niza: 3 54 123 18
		Ispis: Niz nije rastuci.
		Primer2 niza: 71 422 1001 5054
		Ispis: Niz je rastuci. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi duzinu niza: ");
		int duzina = sc.nextInt();
		
		int [] niz = new int[duzina];
		
				
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			int unetiBroj = sc.nextInt();
			
			niz [i] = unetiBroj;				
		}
		
		
		if(jeRastuci(niz)){
			System.out.println("RAstuci");
		} else {
			System.out.println("Nije rastuci");
		}

	}
	
	public static boolean jeRastuci(int[] stariNiz) {
		int duzinaNiza = stariNiz.length;

		for(int i=0; i<duzinaNiza;i++) {
			if(i>0) {
				if(stariNiz[i] < stariNiz[i-1]) {
					return false;
				}
			}
			
		}

		return true;
	}
}

