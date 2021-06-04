package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ConstantsTests {

	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void testFormReg() {
		driver.navigate().to(Constants.URL);
		Constants.inputUsername(driver, "jelena");
		Constants.inputPassword(driver, "123");
		Constants.inputConfirmPassword(driver, "123");
		Constants.submit(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";
		Assert.assertEquals(currentUrl, expectedUrl);
	}

}
