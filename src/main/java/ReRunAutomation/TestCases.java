package ReRunAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {

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

	@Test(retryAnalyzer = ReRunAutomationScripts.class)
	public void TestMethod() {

		String title = driver.getTitle();
		Assert.assertEquals("oogle", title);

	}

}
