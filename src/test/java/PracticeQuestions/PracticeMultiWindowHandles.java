package PracticeQuestions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeMultiWindowHandles {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test
	public void windowTest() {
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		// driver.switchTo().newWindow(WindowType.TAB);
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		Set<String> wins = driver.getWindowHandles();
		for (String win : wins) {
			driver.switchTo().window(win);
		}
		driver.switchTo().window(pw);
	}
}
