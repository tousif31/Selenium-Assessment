package Assessment10Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	 private WebElement backpackName;
	 
	 @FindBy(id = "checkout")
	 private WebElement checkoutBtn;
	 
	 public boolean verifyBackpackDisplayed() {
		 return backpackName.isDisplayed();
		 }
	 public void clickCheckout() {
	 checkoutBtn.click();
	   }
	
}
