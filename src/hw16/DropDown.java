package hw16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}

	@Test(enabled = false)
	public void dropDown() throws InterruptedException {
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropElement);
		select.selectByIndex(2);
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void dropDown2() throws InterruptedException {
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropElement);
		select.selectByValue("search-alias=live-explorations");
		Thread.sleep(5000);
	}

	@Test(enabled = true)
	public void dropDown3() throws InterruptedException {
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropElement);
		select.selectByVisibleText("Amazon Fresh");
		Thread.sleep(5000);
	}

	@AfterTest
	public void quit() {
		driver.quit();
	}

}
