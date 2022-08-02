package hw14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Click_method_by_using_cssSelector {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anannya\\eclipse-workspace\\Selenium_Homework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));// give 10sec to load the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));// give 10sec to find the element
	}

	@Test
	public void clickTest() throws InterruptedException {
		driver.findElement(By.cssSelector("form.style-scope.ytd-searchbox")).click();
		Thread.sleep(5000);

	}

	@AfterTest
	public void quit() {
		driver.quit();
	}
}