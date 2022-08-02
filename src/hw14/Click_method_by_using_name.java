package hw14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Click_method_by_using_name {
	WebDriver driver;

	@BeforeTest
	public void startSetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anannya\\eclipse-workspace\\Selenium_Homework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.walgreens.com/login.jsp?ru=%2F");
		//here i used walgreen 
	}
	@Test
	public void nameTest() throws InterruptedException {
		driver.findElement(By.name("showPassword")).click();
		Thread.sleep(5000);
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}

}
