package doWhile;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// Napisati program koji ce korisniku ispisati poruku 
		//da li je ceo pozitivan broj koji je +uneo palindrom ili nije palindrom. 
		//(palindromi -> isto mu dodje citali sleva nadesno ili s desne na levu stranu).
		
		Scanner sc = new Scanner(System.in);

        int unetiBroj, sacuvanaKopija, inverzni, cifra;

        System.out.println("Unesi broj:");
        unetiBroj = sc.nextInt(); // broj koji korisnik unosi

        sacuvanaKopija = unetiBroj; // kopija broja koji je korisnik uneo, jer cemo u petlji izgubiti deljenjem uneen broj
        inverzni = 0; // inverzni je broj koji nastaje citanjem s desna nalevo, posto nista za sad nije procitano, inicijalizujemo na 0
        while (unetiBroj > 0) {

            cifra = unetiBroj % 10; // uzimamo poslednju cifru iz broja
            unetiBroj /= 10; // da bi smo se oslobodili posl.cifre broj celobrojno delimo sa 10
            inverzni = inverzni * 10 + cifra; // suprotno od onog sto radimo sa unesenim brojem
        }

        if (sacuvanaKopija == inverzni)
            System.out.println("Broj je palindrom!");
        else
            System.out.println("Broj nije palindrom!");

    }

}

