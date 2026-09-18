package Assessment10;

import java.io.IOException;

import org.testng.annotations.Test;

import Assessment10BaseFile.BaseClass01;
import Assessment10Data.ExcelUtility;
import Assessment10Data.PropertyFileUtility;
import Assessment10Pompages.CartPage;
import Assessment10Pompages.CheckoutOverviewPage;
import Assessment10Pompages.CheckoutPage;
import Assessment10Pompages.LoginPage;
import Assessment10Pompages.ProductsPage;

public class SauceDemoTest extends BaseClass01{
	
    @Test(priority = 1)
    public void loginTest() throws IOException {
    	LoginPage loginPage = new LoginPage(driver);

    	String username = PropertyFileUtility.getData("username");
    	String password = PropertyFileUtility.getData("password");

    	loginPage.getUserNameTF(username);
    	loginPage.getPasswordTF(password);
    	loginPage.getLoginbtn();
    	
        ProductsPage productsPage = new ProductsPage(driver);
        
        if(productsPage.verifyProductsPage()) {
                System.out.println("Products page is displayed");}
        else {
        	System.out.println("Products page is not displayed");
        }

        System.out.println("Login Test Passed");
    }
    
    @Test(priority = 2)
    public void orderPalcementTest() throws IOException {
    	
    	   LoginPage loginPage = new LoginPage(driver);

    	    String username = PropertyFileUtility.getData("username");
    	    String password = PropertyFileUtility.getData("password");

    	    loginPage.getUserNameTF(username);
    	    loginPage.getPasswordTF(password);
    	    loginPage.getLoginbtn();
    	
    	
        // Products Page
        ProductsPage productsPage =new ProductsPage(driver);

        // Add Backpack
        productsPage.addBackpackToCart();


        // Verify cart contains 1 item
        if(productsPage.verifyCartContainsOneItem()) {
        	System.out.println("Cart does contain 1 item");
        }
        else {
                System.out.println("Cart does not contain 1 item");
        }


        // Open Cart
        productsPage.clickCart();


        // Cart Page
        CartPage cartPage =new CartPage(driver);

        if(cartPage.verifyBackpackDisplayed()) {
        	System.out.println("Sauce Labs Backpack is  displayed");
        }
        else {
        	System.out.println("Sauce Labs Backpack is not displayed");
        }
                
        // Checkout
        cartPage.clickCheckout();


        // Checkout Page
        CheckoutPage checkoutPage =new CheckoutPage(driver);

        String firstName =ExcelUtility.getData("Sheet1", 1, 0);

        String lastName =ExcelUtility.getData("Sheet1", 1, 1);

        String postalCode =ExcelUtility.getData("Sheet1", 1, 2);

        checkoutPage.enterCheckoutDetails(
                firstName,
                lastName,
                postalCode);


        // Checkout Overview
        CheckoutOverviewPage overviewPage =new CheckoutOverviewPage(driver);
        if(overviewPage.verifyCheckoutOverviewPage()) {
        	System.out.println("Checkout: Overview page is displayed");
        }
        else {
        	System.out.println("Checkout: Overview page is not displayed");
        }
                


        // Finish
        overviewPage.clickFinish();


        // Verify Thank You
        if(overviewPage.verifyThankYouMessage()) {
        	System.out.println("Thank you for your order message is  displayed");
        }
        else {
        	System.out.println("Thank you for your order message is not displayed");
        }

        System.out.println("Order Placement Test Passed");
    }
}
