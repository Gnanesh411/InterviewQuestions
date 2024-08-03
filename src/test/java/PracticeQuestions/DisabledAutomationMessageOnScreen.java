package PracticeQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisabledAutomationMessageOnScreen {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.opencart.com/");

		String title = driver.getTitle();
		if (title.equals("Your Store")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		driver.quit();
	}
}
