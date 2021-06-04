package domaciSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lokatori {

	
	public static final String URL = "http://demo.guru99.com/test/newtours/";
	public static final String TXTSIGN_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a";
	public static final String TXTUSERNAME_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input";
	public static final String TXTPASSWORD_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";
	public static final String SUBMIT_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input";
	public static final String SUPPORT_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a";
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "http://demo.guru99.com/test/newtours/";
		driver.get(URL);
		
		WebElement signON = driver.findElement(By.xpath(TXTSIGN_XPATH));
		signON.click();
				
		WebElement userName = driver.findElement(By.xpath(TXTUSERNAME_XPATH));
		//WebElement firstName = driver.findElement(By.name("userName"));
		//WebElement userName = driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input"));// Css Selector
		userName.sendKeys("Jelena1");
		
		WebElement password = driver.findElement(By.xpath(TXTPASSWORD_XPATH));
		//WebElement password = driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]"));
		password.sendKeys("jelena85");
		
		WebElement submit = driver.findElement(By.xpath(SUBMIT_XPATH));
		//WebElement submit = driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(4) > td > input[type=submit]"));
		//WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		WebElement support = driver.findElement(By.xpath(SUPPORT_XPATH));
		//WebElement support = driver.findElement(By.linkText("SUPPORT"));
		support.click();
		
				
		driver.close();
				
		
	}

}
