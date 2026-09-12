package Assessment5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("./src/test/resources/DD/TestCase.Properties");
		Properties p=new Properties();
		p.load(file);
		String Browser = p.getProperty("Browser");
		String url = p.getProperty("url");
		String email = p.getProperty("email");
		String password = p.getProperty("password");
		
		System.out.println(Browser+url+email+password);
		
		
		WebDriver driver=null;
		if(Browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email,Keys.TAB,password);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		
	}

}
