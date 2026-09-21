package Assessment12OrangeHRMBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Assessment12OrangeHRMData.PropertyFileUtility;



public class BaseClass {
	
	protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Execution Started");
    }

    @BeforeClass
    public void beforeClass() throws IOException {

        String browser = PropertyFileUtility.getData("browser");

        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions option = new ChromeOptions();

            option.addArguments("--disable-notifications");

            driver = new ChromeDriver(option);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
