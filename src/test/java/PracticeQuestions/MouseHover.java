package PracticeQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://stqatools.com/demo/MouseHover.php");
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//button[@class='dropbtn']"))).build().perform();
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dest = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		Thread.sleep(5000);
		//act.dragAndDrop(src,dest).perform();
		act.clickAndHold(src).moveToElement(dest).release(dest).perform();
	}
}
