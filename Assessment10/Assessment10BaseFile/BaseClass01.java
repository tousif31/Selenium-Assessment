package Assessment10BaseFile;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Assessment10Data.PropertyFileUtility;

public class BaseClass01 {
	protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Execution Started");
    }

    @BeforeClass
    public void beforeClass() throws IOException {

        String browser = PropertyFileUtility.getData("browser");
    	
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void beforeMethod() throws IOException {

        driver.get(PropertyFileUtility.getData("url"));
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Test Method Completed");
    }

    @AfterClass
    public void afterClass() {

        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Execution Completed");
    }
}
