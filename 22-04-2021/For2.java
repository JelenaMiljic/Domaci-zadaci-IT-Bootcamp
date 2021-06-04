package for1;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// 2. For2: Napisati program koji ce na standardnom izlazu ispisati zbir
		// prirodnih brojeva do n na sledeci nacin:
		// 1) u zbir nece ulaziti brojevi deljivi brojem 5
		// 2) ako se naidje na broj 13, sabiranje ce se zavrsiti i ispisace se zbir
		// brojeva do tog trenutka.

		Scanner sc = new Scanner(System.in);
		int n;
		int zbir = 0;

		System.out.println("Unesite broj:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i == 13) {
				break;
			}
			
			if (i % 5 != 0) {
				zbir = zbir + i;				
			}
		}
		System.out.println("Zbir je: " + zbir);
	}
}
