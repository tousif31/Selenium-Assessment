package Assessment10Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	 @FindBy(id = "first-name")
	 private WebElement firstNameTF;

	 @FindBy(id = "last-name")
	 private WebElement lastNameTF;

	 @FindBy(id = "postal-code")
	 private WebElement postalCodeTF;

	 @FindBy(id = "continue")
	 private WebElement continueBtn;
	 
	 public void enterCheckoutDetails(
	            String firstName,
	            String lastName,
	            String postalCode) {

	        firstNameTF.sendKeys(firstName);
	        lastNameTF.sendKeys(lastName);
	        postalCodeTF.sendKeys(postalCode);

	        continueBtn.click();
	    }
}
