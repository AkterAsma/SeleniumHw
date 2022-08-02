package hw14;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Click_method_by_using_id {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anannya\\eclipse-workspace\\Selenium_Homework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test
	public void usingId() throws InterruptedException {
		 driver.findElement(By.id("nav-search-submit-button")).click();//by ID
		Thread.sleep(5000);
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}

}