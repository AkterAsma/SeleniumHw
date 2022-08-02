package hw15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_getText_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anannya\\eclipse-workspace\\Selenium_Homework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.walgreens.com/login.jsp?ru=%2F");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));// give 10sec to load the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));// give 10sec to find the element
	}

	@Test
	public void getText() throws InterruptedException {
		WebElement cna = driver.findElement(By.cssSelector("button.secondary.btn.btn__tint-blue.btn-block.mb20"));
		System.out.println("The text is: " + cna.getText());

	}

	@AfterTest
	public void quit() {
		driver.quit();
	}
}
