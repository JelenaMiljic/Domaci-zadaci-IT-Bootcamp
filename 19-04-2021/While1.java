package petljaWhile;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, 
		//i ispisuje njihov zbir (zbir pozitivnih brojeva).
		//primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
		
			
			int broj = 0;
			int zbir = 0;
			
						
			while (broj >=0) {
				
				Scanner sc = new Scanner (System.in);
				
				System.out.println("Unesi broj:");
				broj = sc.nextInt();
				if (broj<0){
					break;
					
				}
			zbir = zbir + broj;
			System.out.println("Zbir je:" + zbir);
			
			
			}
			
	
	}

}
