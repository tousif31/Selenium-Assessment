package Assessment2Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BuzzLink {
	WebDriver driver;
	public BuzzLink(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[text()='Buzz']")
	private WebElement buzz;
	
	@FindBy(css = "[placeholder=\"What's on your mind?\"]")
	private WebElement enterdata;
	
	public void getBuzz() {
		buzz.click();
	}
	
	public void getEnterdata(String data) {
		enterdata.sendKeys(data);
	}
	@FindBy(css = "[type='submit']")
	private WebElement post;
	
	public void getPost() {
		post.click();
	}
	
	@FindBy(xpath = "(//div[contains(@class,'orangehrm-buzz-post-body')])[1]")
	private WebElement recentPost;
	
	
	public boolean getRecentPost(String test) {
		String txt=recentPost.getText();
		return txt.equals(test);
	}
	
	public void verify(String argas) {
		Assert.assertTrue(getRecentPost(argas));
		System.out.println("virification successfull");
	}
	
	
}
