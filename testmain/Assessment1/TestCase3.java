package Assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		WebElement mc= driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement lc= driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement mco= driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement lco= driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement ma=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement la=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(mc, ma).perform();
		action.dragAndDrop(mco, ma).perform();
		action.dragAndDrop(lc, la).perform();
		action.dragAndDrop(lco, la).perform();
	}
}
