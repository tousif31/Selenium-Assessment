package Assessment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bag",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'SKUDeck')][.//*[contains(normalize-space(),'Mono Cobie Logo Leather Small Backpack - Beige')]]//button[normalize-space()='Add']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
