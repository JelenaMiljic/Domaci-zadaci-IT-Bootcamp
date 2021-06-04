package domaciFunkc;

import java.util.Scanner;

public class Funkcije1 {

	public static void main(String[] args) {
		/* Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		(znaci da korisnik unosi tri broja)
		i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja.*/

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi prvi broj");
		int broj1 = sc.nextInt();
		
		System.out.println("Unesi drugi broj");
		int broj2 = sc.nextInt();
		
		System.out.println("Unesi treci broj");
		int broj3 = sc.nextInt();
		
		/*int broj1 = 5;
		int broj2 = 3;
		int broj3 = 2;*/
		
		najmanjiBroj(broj1, broj2, broj3);
		
		System.out.println(" Najmanji broj je: " + najmanjiBroj(broj1, broj2, broj3)); 
		}
	
	public static int najmanjiBroj ( int a, int b, int c) {
		if (a<b && a<c) {
			return a;
			
		} 
		if (b<a && b<c) {
			return b;
			}
		else {
			return c;
			}
		}
}
