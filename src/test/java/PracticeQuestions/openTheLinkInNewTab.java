package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openTheLinkInNewTab {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement Regclick = driver.findElement(By.linkText("Register"));
		Actions act = new Actions(driver);

		// Cntl+Regclick
		act.keyDown(Keys.CONTROL).click(Regclick).keyUp(Keys.CONTROL).perform();

		// switching to registration page
		List<String> ids = new ArrayList<String>(driver.getWindowHandles());
		
		//RegistrationPage
		driver.switchTo().window(ids.get(1));//swith to registration page
		driver.findElement(By.id("FirstName")).sendKeys("damodara");
		
		//HomePage
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.id("small-searchterms")).sendKeys("Hp");
		

	}
}
