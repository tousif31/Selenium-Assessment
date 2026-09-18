package Assessment10Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "user-name")
	private WebElement userNameTF;
	
	@FindBy(id = "password")
	private WebElement passwordTF;
	
	@FindBy(id = "login-button")
	private WebElement Loginbtn;
	
	public void getUserNameTF(String username) {
		userNameTF.sendKeys(username);
	}

	public void getPasswordTF(String password) {
		passwordTF.sendKeys(password);
	}

	public void getLoginbtn() {
		Loginbtn.click();
	}
}
