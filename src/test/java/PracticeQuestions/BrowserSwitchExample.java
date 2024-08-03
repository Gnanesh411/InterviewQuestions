package PracticeQuestions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSwitchExample {
    public static void main(String[] args) {
        // Initialize the first browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");  // Open a website
        // Perform actions in the first browser
        // Initialize the second browser
        WebDriver tempDriver = new ChromeDriver();
        tempDriver.get("https://google.com"); // Open a different website
        // Perform actions in the second browser
        
        // Close the second browser
        tempDriver.quit();
        System.out.println("temp browser closed");
        
        // Continue working with the first browser
        // ...
        driver.quit();  // Close the first browser when done
        System.out.println("main browser closed");
    }
}