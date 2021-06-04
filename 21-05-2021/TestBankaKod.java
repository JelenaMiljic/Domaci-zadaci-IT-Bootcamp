package bankaDom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBankaKod {

	
	@Test
	public void testKonstruktor() {
		BankaKod bk = new BankaKod("Jelena","123-456"); 
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(bk.dohvatiIme(), "Jelena");  //String dohvatiIme = "ime"  - pada test
		sa.assertEquals(bk.dohvatiZiroRacun(), "123-456");
		sa.assertEquals(bk.dohvatiIznos(), 0d);
		
		sa.assertAll();
	}
	
	@Test
	public void testGet() {
		String ime = "Jelena";
		String ziroRacun = "123-456";
		double iznos = 0d;
		
		
		BankaKod bk = new BankaKod(ime, ziroRacun);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(bk.dohvatiIme(), ime); //  String dohvatiIme = "ime" - ne pise u tekstu zadatka da ispravimo kod
		sa.assertEquals(bk.dohvatiZiroRacun(), ziroRacun);
		sa.assertEquals(bk.dohvatiIznos(), iznos);
		
		sa.assertAll();
	
		
	}
}
