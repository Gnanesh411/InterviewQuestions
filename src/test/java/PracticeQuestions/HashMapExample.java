package PracticeQuestions;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("username")).sendKeys(getUserName("gnanesh"));
		driver.findElement(By.name("password")).sendKeys(getPassWord("gnanesh"));
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

	public static HashMap<String, String> getCredentials() {
		HashMap<String, String> details = new HashMap<String, String>();
		details.put("gnanesh", "Admin:admin123");
		return details;
	}

	public static String getUserName(String uname) {
		String u_name = getCredentials().get(uname);
		return u_name.split(":")[0];
	}

	public static String getPassWord(String pswd) {
		String u_pass = getCredentials().get(pswd);
		return u_pass.split(":")[1];
	}

}
