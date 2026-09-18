package Assessment10Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver driver;
	public ProductsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[text()='Products']")
	private WebElement productsText;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement backpackAddToCartBtn;
	
	@FindBy(className = "shopping_cart_link")
	private WebElement cartIcon;
	
	@FindBy(className = "shopping_cart_badge")
	private WebElement cartBadge;
	
	 public boolean verifyProductsPage() {
	        return productsText.isDisplayed();
	    }

	    public void addBackpackToCart() {
	        backpackAddToCartBtn.click();
	    }

	    public boolean verifyCartContainsOneItem() {
	        return cartBadge.isDisplayed()
	                && cartBadge.getText().equals("1");
	    }

	    public void clickCart() {
	        cartIcon.click();
	    }
}
