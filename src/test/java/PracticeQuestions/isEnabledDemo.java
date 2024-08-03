package PracticeQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.xpath("//*[@id='email']")).isEnabled();
		if (logo == true) {
			System.out.println("Text box is enable to print");
		} else {
			System.out.println("not enable");
		}
	}
}