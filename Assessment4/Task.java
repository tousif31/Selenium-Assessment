package Assessment4;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		 List<WebElement> input = driver.findElements(By.tagName("input"));
		 int count=input.size();
		 System.out.println(count);
		 
		 for(WebElement l:input) {
			@Nullable
			String text = l.getAttribute("name");
			if(text.equals("email")) {
				l.sendKeys("tousif");
				System.out.println(l.getAttribute("name"));
			}
			else if(text.equals("pass")) {
				l.sendKeys("tousif@123");
				System.out.println(l.getAttribute("name"));
				break;
			}
			
		 }
	}
}
