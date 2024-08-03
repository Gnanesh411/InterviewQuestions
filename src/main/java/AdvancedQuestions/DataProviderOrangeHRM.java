package AdvancedQuestions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderOrangeHRM {

	public static WebDriver driver;

	@BeforeTest
	public void setUP() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "details", dataProviderClass = DataProviderOrangeHRM.class)
	public static void loginTest(Map<String, String> mp) {
		driver.findElement(By.name("username")).sendKeys(mp.get("id"));
		driver.findElement(By.name("password")).sendKeys(mp.get("pin"));
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	@DataProvider(name = "details")
	public Object[][] data() throws Exception {
		Map<String, String> mp = FromXlReadData.readData(System.getProperty("user.dir") + "\\TestData\\MapData.xlsx",
				"Sheet1");
		Object[][] mp1 = { { mp } };
		return mp1;
	}
}