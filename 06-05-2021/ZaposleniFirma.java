package domaciKlasee2;

public class ZaposleniFirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zaposleni z1 = new Zaposleni("Petar", "Petrovic");
		Zaposleni z2 = new Zaposleni("Ana", "Anic");
		Zaposleni z3 = new Zaposleni("Marko", "Markovic");

		z1.setZarada(2000);

		z1.setPozicija("menadzer");

		z2.setZarada(500);

		z2.setPozicija("Junior QA");

		z3.setPozicija("dev");

		z3.setZarada(1200);

		Zaposleni[] radnici = { z1, z2, z3 };

		Firma f1 = new Firma("neka firma", "Beograd", "123456", radnici);

		Zaposleni z = f1.getZaposleni()[2];

		//System.out.println(z.getIme());

		System.out.println(f1.toString());
	}
}

/*
 * Zaposleni [] zaposleni1 = {z1, z2, z3}; 
 * Zaposleni [] zaposleni2 = {z4, z5, z6};
 * 
 * Firma f1 = new Firma("Ekonomoffice", "Beograd", 123456789, zaposleni1); Firma
 * f2 = new Firma("Knjigovodstvena agencija", "Beograd", 987654321, zaposleni1);
 * 
 * 
 * System.out.println(f1.getZaposleni());
 * 
 * System.out.println(f2.getZaposleni[]);
 */
