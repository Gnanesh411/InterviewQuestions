package PracticeQuestions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class enabaleExtentensioAtRunTime {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		File file = new File("C:\\Users\\gnane\\Downloads\\SelectorsHub-Chrome-Web-Store.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.opencart.com/");

	}
}
