package domaciTestNG1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {

	
	@Test
	public void pKruga() {

		Calc c1 = new Calc();
		double rez = c1.pKruga(6.0);
		Assert.assertEquals(rez, 113.04);
		
	}
	
	@Test
	public void pKvadrata() {
		
		Calc c1 = new Calc();
		double rez = c1.pKvadrata(4);
		Assert.assertEquals(rez, 16);
	}
	
	@Test
	public void pPravugaonika() {
		Calc c1 = new Calc();
		double rez = c1.pPravougaonika(5.0, 3.0);
		Assert.assertEquals(rez, 15.0);
	}
}
