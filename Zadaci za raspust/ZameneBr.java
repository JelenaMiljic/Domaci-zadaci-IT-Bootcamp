package projekatIzadaci;

public class ZameneBr {

	public static void main(String[] args) {
		/* ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene. 
		 * Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih */
		
		int x = 3;
		int y = 7;
		
		System.out.println("x=" + x + " y=" + y);
		
		int pomocna; 
		
		pomocna= x;
		x = y;
		y = pomocna;
		
		System.out.println("x=" + x + " y=" + y);

		
	}

}
