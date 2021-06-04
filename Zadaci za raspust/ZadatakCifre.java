package projekatIzadaci;

import java.util.Scanner;

public class ZadatakCifre {

	public static void main(String[] args) {
		/* Napisati program koji ispisuje koliko cifara ima uneti broj n. */
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj:");

	int broj = sc.nextInt();
	int brojCifara = 0;
	
	while (broj > 0 ) {
		broj = broj/10;
		brojCifara=brojCifara+1;
	
	}
	
	System.out.println("Uneseni broj ima:" + brojCifara+ "cifara");
	
	}

}
