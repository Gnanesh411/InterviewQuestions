package PracticeQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRows.size(); i++) {
			List<WebElement> tData = driver.findElements(By.tagName("td"));
			for (int j = 0; j < tData.size(); j++) {
				if (tData.get(j).getText().equals("Denmark")) {
					driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]"));
					System.out.println(tData.get(j).getText());
				}
			}
		}
	}
}
