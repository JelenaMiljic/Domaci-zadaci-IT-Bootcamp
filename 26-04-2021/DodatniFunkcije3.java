package domaciFunkc;

import java.util.Scanner;

public class DodatniFunkcije3 {

	public static void main(String[] args) {
		// Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva
		// i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva.

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi prvi broj: ");
		int broj1 = sc.nextInt();
		System.out.println("Unesi drugi broj: ");
		int broj2 = sc.nextInt();
		System.out.println("Unesi treci broj: ");
		int broj3 = sc.nextInt();
		
		
		System.out.println("Zbir unetih brojeva je:" + zbir(broj1, broj2, broj3));
	
		System.out.println("Najveci broj je: " + najveciBroj(broj1, broj2, broj3));
		
		
	}

	public static int zbir(int a, int b, int c) {
		int d = a + b + c;
		return d;

	}

	public static int najveciBroj ( int a, int b, int c) {
		if (a>b && a>c) {
			return a;
			
		} 
		if (b>a && b>c) {
			return b;
			}
		else {
			return c;
			}
		}
	
}
