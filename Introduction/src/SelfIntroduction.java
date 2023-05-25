import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods
		
		//WebDriver + Chrome Methods
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\uvhar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver  driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\uvhar\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/"); 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
