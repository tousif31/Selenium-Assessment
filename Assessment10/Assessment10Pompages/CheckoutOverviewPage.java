package Assessment10Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
	WebDriver driver;
	public CheckoutOverviewPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
    @FindBy(xpath = "//span[text()='Checkout: Overview']")
    private WebElement checkoutOverviewText;

    @FindBy(id = "finish")
    private WebElement finishBtn;

    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    private WebElement thankYouMessage;
    
    public boolean verifyCheckoutOverviewPage() {
        return checkoutOverviewText.isDisplayed();
    }

    public void clickFinish() {
        finishBtn.click();
    }

    public boolean verifyThankYouMessage() {
        return thankYouMessage.isDisplayed();
    }
}
