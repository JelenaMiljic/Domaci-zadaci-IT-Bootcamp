package projekatIzadaci;

import java.util.Scanner;

public class ZbirPrvihBr {

	public static void main(String[] args) {
		/* 3.	Napisati program koji racuna zbir prvih n prirodnih brojeva, izostavljajuci one koji su deljivi brojem k.  */

		Scanner sc = new Scanner(System.in);
		int n;
		int k;
		int zbir = 0;
		
		System.out.println("Unesite broj:");
		n= sc.nextInt();
		
		System.out.println("Unesite vrednos za k");
		k=sc.nextInt();
		
		for (int i= 1; i<=n; i++) {
			if (i % k !=0) {
			zbir = zbir + i;
		}
	}
	System.out.println("zbir je:" + zbir);
	
}
}