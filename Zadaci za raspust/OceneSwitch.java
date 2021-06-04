package projekatIzadaci;

import java.util.Scanner;

public class OceneSwitch {

	public static void main(String[] args) {
		/* /*
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
		
		int srednjaOcena = (ocena1 + ocena2 + ocena3) /3;
		
		System.out.print("srednja ocena je " + srednjaOcena);
		
		
		switch (srednjaOcena) {
		case 5: 
			System.out.println(" (odlican)");
		break;
		case 4:
			System.out.println(" (vrlo dobar)");
		break;
		case 3:
			System.out.println(" (dobar)");
		break;
		case 2:
			System.out.println(" (dovoljan)");
		break;
		
		default: System.out.println(" (nedovoljan)");
		}
		
	}

}
