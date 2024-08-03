package PracticeQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee2"));
		Select s = new Select(w);
		List<WebElement> web = s.getOptions();
		for (int i = 0; i < web.size(); i++) {
			s.selectByIndex(i);
		}
	}
}