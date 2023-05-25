import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uvhar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// sibling = parent traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	}

}
