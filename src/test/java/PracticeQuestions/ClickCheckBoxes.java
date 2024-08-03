package PracticeQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCheckBoxes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		List<WebElement> w = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement x : w) {
			x.click();
		}
	}
}