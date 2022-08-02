package hw13_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TentNG1 {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anannya\\eclipse-workspace\\Selenium_Homework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void ebayTest() throws InterruptedException {
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
	}

	@AfterTest
	public void closingBrowser() {
		driver.quit();
	}

}