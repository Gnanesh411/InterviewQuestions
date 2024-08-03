package AdvancedQuestions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement p = driver.findElement(By.id("newWindowBtn"));
		p.click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id = ids.iterator();
		while (id.hasNext()) {
			// System.out.println(id.next());
			String title = driver.switchTo().window(id.next()).getTitle();
			System.out.println(title);
		}
		driver.close();
	}
}
