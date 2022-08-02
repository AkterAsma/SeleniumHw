package hw16;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHoverAction {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anannya\\eclipse-workspace\\Selenium_Homework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@Test
	public void mouseHover() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement selectLocation = driver.findElement(By.id("glow-ingress-line2"));
		actions.moveToElement(selectLocation).build().perform();
		Thread.sleep(5000);
		System.out.println("\n Expected text : Select your address "+ "Actual text is :" + selectLocation.getText() );
		

	}

	@AfterTest
	public void endingBrowser() {
		driver.quit();

	}

}