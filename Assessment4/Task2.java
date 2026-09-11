package Assessment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.zomato.com/bangalore/delivery");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("auth-login-ui");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9980665378");
		driver.switchTo().defaultContent();
		
		WebElement text = driver.findElement(By.xpath("//p[text()='Biryani']"));
		System.out.println(text.getText());
	}

}
