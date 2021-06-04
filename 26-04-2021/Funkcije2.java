package domaciFunkc;

import java.util.Scanner;

public class Funkcije2 {

	public static void main(String[] args) {
		/*: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi prvi broj");
		int broj1 = sc.nextInt();
		
		System.out.println("Unesi drugi broj");
		int broj2 = sc.nextInt();
		
		System.out.println("Unesi treci broj");
		int broj3 = sc.nextInt();
		
		
		/*int broj1 = 2;
		int broj2 = 5;
		int broj3 = 7;
		
	
		pomnozi(broj1, broj2, broj3);*/
		
		
		System.out.println("Proizvod unetih brojeva je:" + pomnozi(broj1, broj2, broj3)); 
	}
	
	public static int pomnozi (int a, int b, int c){
		int d = a * b * c;
		return d;

}
}