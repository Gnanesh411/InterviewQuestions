package PracticeQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplSendKeyevents {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		WebElement x = driver.findElement(By.id("username"));

		x.sendKeys("vengatram");

		WebElement x1 = driver.findElement(By.name("password"));

		x.sendKeys(Keys.CONTROL, "ac");
		Thread.sleep(3000);
		x1.sendKeys(Keys.CONTROL, "v");
		WebElement but = driver.findElement(By.id("login"));
		but.click();
	}
}