package domaciSelenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "http://demo.guru99.com/test/newtours/";
		driver.get(url);
	}

}
