package Assessment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		   WebElement firstName = driver.findElement(By.xpath("//label[normalize-space()='First name']/preceding::input[1]"));

	        WebElement surname = driver.findElement(By.xpath("//label[normalize-space()='Surname']/preceding::input[1]"));
		
//		firstName.sendKeys("tousif");
//		surname.sendKeys("tousif");

		
		int firstNameY = firstName.getLocation().getY();
		int surnameY = surname.getLocation().getY();

	
		if (firstNameY == surnameY) {
		    System.out.println("First Name and Surname are aligned");
		} else {
		    System.out.println("First Name and Surname are NOT aligned");
		}
	}

}
