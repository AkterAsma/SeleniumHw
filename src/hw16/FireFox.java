package hw16;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FireFox {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Anannya\\eclipse-workspace\\Selenium_Homework\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	}

	@Test
	public void usingFireFox() {
		driver.get("https://www.amazon.com/");
	}

	@AfterTest
	public void quit() {
		driver.quit();
	}

}