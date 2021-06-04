package projekatIzadaci;

import java.util.Scanner;

public class Kod {

	public static void main(String[] args) {

	       //Ovaj kod predstavlja kalkulator povrsina
	       //kvadrata, pravougaonika i kruga.
	       //Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
	       //Ukoliko se unese 'izadji', program treba da se zavrsi.
	       //Program treba da se ponavlja dokle god se ne unese izadji.
		
		Scanner sc = new Scanner(System.in);
	       String figura;
	       while (true) {
	           figura = sc.nextLine();
	           switch (figura) {
	               case "kvadrat":
	                   racunajKvadrat();
	               case "pravougaionik":
	                   racunajPravougaonik();
	               case "krug":
	                   racunajKrug();
	               case "izadji":
	                   return;
	           }
	       }
	   }

	   public static void racunajKrug() {
	       Scanner sc = new Scanner(System.in);
	       double r;
	       r = sc.nextDouble();
	       if (r <= 0) {
	           System.out.println("Los unos!");
	           return;
	       }
	       System.out.println("Povrsina pravougaionika je: " + pKruga(r)); //"Povrsina kruga je:" + 
	   }

	   public static void racunajPravougaonik() {
	       Scanner sc = new Scanner(System.in);
	       double a, b;
	       a = sc.nextDouble();
	       b = sc.nextDouble();
	       if (a <= 0 || b <= 0) {
	           System.out.println("Los unos!");
	           return;
	       }
	       System.out.println("Povrsina pravougaionika je: " + pPravougaonika(a, b));

	   }

	   public static void racunajKvadrat() {
	       Scanner sc = new Scanner(System.in);
	       double a;
	       a = sc.nextDouble();
	       if (a <= 0) {
	           System.out.println("Los unos!");
	           return;
	       }
	       System.out.println("Povrsina kvadrata je: " + pKruga(a));  // ... + pKvadrata(a));

	   }

	   public static double pKruga(double r) {
	       return r * r * 3.14;
	   }

	   public static double pKvadrata(int a) {//umesto pKvadrata (int a) treba da pise umesto pKvadrata (double a)
	       return a * a * a; // treba da pise return a * a;
	   }

	   public static double pPravougaonika(double a, double b) {
	       return a * b;
	   }
	}
	
		
