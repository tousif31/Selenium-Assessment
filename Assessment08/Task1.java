package Assessment08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1 {
	
	WebDriver driver;
	public Task1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = "[name='username']")
	private WebElement user;
	
	@FindBy(css = "[name='password']")
	private WebElement pass;
	
	
	@FindBy(css = "[type='submit']")
	private WebElement login;
	
	
	public void getUser(String u) {
		user.sendKeys(u);
	}

	public void getPass(String p) {
		pass.sendKeys(p);
	}

	public void getLogin() {
		login.click();
	}

}
