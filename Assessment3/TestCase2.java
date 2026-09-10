package Assessment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.className("react-datepicker__input-container")).click();
		WebElement nextMouth = driver.findElement(By.cssSelector("[aria-label='Next Month']"));
		nextMouth.click();

		//div[contains(@class,'react-datepicker__day') and text()='15' and not(contains(@class,'outside-month'))]
		
		WebElement date = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='15' and not(contains(@class,'outside-month'))]"));
		date.click();
		
		WebElement datefield=driver.findElement(By.xpath("//input[@placeholder='Select A Date']"));
	
        String selectedDate = datefield.getAttribute("value");
        System.out.println(selectedDate);
        
        if(selectedDate.equals("15/10/2026")) {
        	System.out.println("current Date visble");
        }else {
			System.out.println("current date not visible");
		}
        driver.quit();
	}
}
