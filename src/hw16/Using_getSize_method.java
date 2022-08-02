package hw16;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_getSize_method {
		WebDriver driver;
		
		@BeforeTest
		public void setUp() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Anannya\\eclipse-workspace\\Selenium_Homework\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().fullscreen();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		}
		
		
		public void method() throws InterruptedException {
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println("the size of the screen:"+ driver.manage().window().getSize());
			}
		
		@AfterTest
		public void tearUp() {
			driver.quit();
		}

	}