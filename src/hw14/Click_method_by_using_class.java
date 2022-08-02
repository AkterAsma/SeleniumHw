package hw14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Click_method_by_using_class {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anannya\\eclipse-workspace\\Selenium_Homework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.get("https://www.amazon.com/");
		// driver.get("https://www.ebay.com/");
		// driver.get("https://www.walgreens.com/login.jsp?ru=%2F");
		driver.get(
				"https://www.macys.com/?cm_mmc=Google_Trademark-_-GGL_Trademark_Core_Exact_GGL_Macys_Trademark_Core_Macys_Exact-_-565798938467-_-macys_e_c_kclickid__kenshoo_clickid__KID_891_10091130926_102928468058_565798938467_kwd-13122476___c_KID_&trackingid=486x762434&m_sc=sem&m_sb=Google&m_tp=Text&m_ac=Google_Trademark&m_ag=GGL_Macys_Trademark_Core_Macys_Exact&m_cn=GGL_Trademark_Core_Exact&m_pi=go_cmp-10091130926_adg-102928468058_ad-565798938467_kwd-13122476_dev-c_ext-_prd-&gclid=CjwKCAjwquWVBhBrEiwAt1Kmwhyn4dKLEcytFZxMITx-XeXdjAJwqQ8bwpFQWXJzopI5_rTqJaLMtxoCBb8QAvD_BwE");
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));//give
		// 10sec to load the page
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));//give
		// 10sec to find the element
	}

	@Test
	public void classTest() throws InterruptedException {
		// driver.findElement(By.id("nav-search-submit-button")).click();//by ID
		// driver.findElement(By.linkText("Careers")).click();//by linktext
		// driver.findElement(By.partialLinkText("Amazon N")).click();//by partial
		// linktext
		// driver.findElement(By.name("showPassword")).click();//by name
		driver.findElement(By.className("header-logo__image")).click();//by class macys

		Thread.sleep(5000);

	}

	@AfterTest
	public void quit() {
		driver.quit();

	}

}
