package projekatIzadaci;

import java.util.Scanner;

public class Ocene {

	public static void main(String[] args) {
		/*
		 * 4. Napisati program koji za tri unete ocene ispisuje srednju vrednost i u
		 * numerièkom i opisnom obliku (opisan oblik - odlican, vrlo dobar, dobar,
		 * dovoljan, nedovoljan)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite prvu ocenu ");
		int ocena1 = sc.nextInt();

		System.out.print("Unesite drugu ocenu ");
		int ocena2 = sc.nextInt();

		System.out.print("Unesite trecu ocenu ");
		int ocena3 = sc.nextInt();

		int srednjaOcena = (ocena1 + ocena2 + ocena3) / 3;

		System.out.print("Srednja ocena je " + srednjaOcena);

		if (srednjaOcena > 4.5) {
			System.out.println(" (odlican)");

		} else if (srednjaOcena > 3.5) {
			System.out.println(" (vrlo dobar)");

		} else if (srednjaOcena > 2.5) {
			System.out.println(" (dobar)");

		} else if (srednjaOcena > 2) {
			System.out.println(" (dovoljan)");

		} else {
			System.out.println(" (nedovoljan)");
		}
	}
}