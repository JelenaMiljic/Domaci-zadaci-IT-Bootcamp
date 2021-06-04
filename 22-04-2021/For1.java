package for1;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// 1.	For1: Napisati program koji omoguciti korisniku da unosi recii, sve dok ne unese rec �stop�, 
		//nebitno da li je koristio mala, velika slova ili kombinaciju.
		//Mozete pri radu koristiti petlju po izboru.
		
		Scanner sc = new Scanner (System.in);
		String rec;
		String stop = "stop";
		String recObradjen;
		String stopp = stop.toUpperCase();
		
		
		do {
			System.out.println("Unesi rec: ");
			rec = sc.nextLine();
			recObradjen = rec.toUpperCase();
			
		} while (!stopp.equals(recObradjen));
		System.out.println("Pogodio si! ");
	

	}

}
