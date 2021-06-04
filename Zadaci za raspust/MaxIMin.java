package projekatIzadaci;

import java.util.Scanner;

public class MaxIMin {

	public static void main(String[] args) {
		/*
		 * Napisati program gde korisnik unosi n brojeva i ispisuje maksimalni i
		 * minimalni broj.
		 */

		Scanner sc = new Scanner(System.in);
		int broj;
		int n;
		int min = 0;
		int max = 0;
		
		System.out.println("Koliko brojeva zelis da uneses");
		n= sc.nextInt();

		
		for (int i =1; i<=n; i++) {
			System.out.println("unesi broj " + i);
			broj = sc.nextInt();
			if (i==1) {
				max=broj;
				min=broj;
			}
			
			if (broj>max) {
				max=broj;
			}
			if (broj<min) {
				min = broj;
			}
			
		}

		System.out.println("Makcimalan broj je: " + max);
		System.out.println("Minimalan broj je: " + min);
	}
}
