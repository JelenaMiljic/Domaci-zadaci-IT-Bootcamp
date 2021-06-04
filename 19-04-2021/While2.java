package petljaWhile;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// : Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” 
		//onoliko puta koliko je korisnik zadao preko konzole.
		//Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta 

		System.out.println("Unesi broj:");
		Scanner sc = new Scanner(System.in);
						
		int broj;
		broj = sc.nextInt();
		int iterator = 1;
		
		while(iterator <= broj) {
		System.out.println("Laku noc!");
		iterator = iterator + 1;
					
		}
		
	}

}
