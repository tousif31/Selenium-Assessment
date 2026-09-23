package Assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestCase4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='Apple AirPods (2nd Generation)']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		WebElement clicks = driver.findElement(By.id("Check"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clicks));
		clicks.click();
	
		String text = driver.findElement(By.xpath("//a[text()='Check deliverable pins.']")).getText();
		Assert.assertEquals(text, "Check deliverable pins.");
		System.out.println("Verification successfull");
	}

}

