package PracticeQuestions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesandTabs {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// driver.switchTo().newWindow(WindowType.TAB);//opens new Tab//selenium 4.0x

		driver.switchTo().newWindow(WindowType.WINDOW);// opens new window

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys(getUsername("details"));
		driver.findElement(By.name("password")).sendKeys(getPassword("details"));
		Thread.sleep(3000);

		List<String> ids = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(ids.get(0));
	}

	public static HashMap<String, String> getDetails() {
		HashMap<String, String> mp = new HashMap<String, String>();
		mp.put("details", "Admin:admin123");
		return mp;
	}

	public static String getUsername(String uname) {
		String admin = getDetails().get(uname);
		return admin.split(":")[0];

	}

	public static String getPassword(String pass) {
		String admin123 = getDetails().get(pass);
		return admin123.split(":")[1];

	}
}
