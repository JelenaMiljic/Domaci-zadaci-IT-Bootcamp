package projekatIzadaci;

import java.util.Scanner;

public class NizInverzno {

	public static void main(String[] args) {
		/* 6.	Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
	Primer niza: 32 54 123 18
		Ispis: 18 123 54 32 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi duzinu niza: ");
		int duzina = sc.nextInt();
		
		int [] niz = new int[duzina];
		
			
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			int unetiBroj = sc.nextInt();
			
			niz [i] = unetiBroj;				
		}
		
		
		for (int i=duzina; i>0; i--) {
			System.out.println( niz [i-1] );
			
		}
		
	}

}
