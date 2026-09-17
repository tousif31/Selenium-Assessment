package Assessment9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1implementation {
	WebDriver driver;
	
	public void lanchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void OpenUrl() {
		driver.get("https://www.saucedemo.com/");
	}
	public void userpass() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce");
	}
	public void login() {
		driver.findElement(By.id("login-button")).click();
	}
	public void closeBrowser() {
		driver.quit();
	}
}
