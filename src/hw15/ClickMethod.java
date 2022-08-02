package hw15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickMethod {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Anannya\\eclipse-workspace\\Selenium_Homework\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	}

	@Test
	public void clickMethod() throws InterruptedException {
		driver.findElement(By.cssSelector("form.style-scope.ytd-searchbox")).click();
		Thread.sleep(5000);

	}

	@AfterTest
	public void quit() {
		driver.quit();
	}

}