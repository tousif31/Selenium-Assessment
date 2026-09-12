package Assessment5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		FileReader file=new FileReader("./src/test/resources/DD/TaseCase3.json");
		JSONParser jp=new JSONParser();
		Object obj=jp.parse(file);
		JSONObject json=(JSONObject)obj;
		
		
		String browser = json.get("Browser").toString();
		String url = json.get("url").toString();
		String name = json.get("name").toString();
		String username = json.get("email").toString();
		String password = (json.get("password").toString());
		
		System.out.println(browser+"\n"+url+"\n"+name+"\n"+username+"\n"+password);
		
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys(name,Keys.TAB,username,Keys.TAB,password);
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}

}
