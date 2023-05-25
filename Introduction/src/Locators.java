import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uvhar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(By.id("inputUsername")).sendKeys("Harish");
		// For CSS selector : Tagname[attribute='value'] , tagename.classname , tagname#id 
		
		//driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("hari");
		//driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		// For Xpath : starts with // , syntax: tagname[@attribute='Value'] and for checking in dev console : $x('tagname[@attribute="Value"]')
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Harish");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("uvharish9012@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		//driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9492230904");
		driver.findElement(By.xpath("//form//input[3]")).sendKeys("9492230904");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Harish");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.findElement(By.className("logout-btn")).click();
		
		
		
		//driver.quit();
		
		//Note : in ui - console - $('tagename.attribute') EX: $('p.error') for above error location identification
		
	}

}
