package RetryWithXML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ReRunAutomation.ReRunAutomationScripts;

public class Test_Exucution {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}

	@AfterTest
	public void afteTest() {

		driver.quit();
	}

	@Test
	public void TestMethod1() {

		String title = driver.getTitle();
		Assert.assertEquals("Google", title);

	}

	@Test
	public void TestMethod2() throws InterruptedException {

		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();

	}

	@Test
	public void TestMethod3() {
		assert false;
	}

}
