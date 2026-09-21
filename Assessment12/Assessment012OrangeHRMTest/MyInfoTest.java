package Assessment012OrangeHRMTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Assessment012OrangeHRMBase.BaseClass;
import Assessment012OrangeHRMData.ExcelUtility;
import Assessment012OrangeHRMData.PropertyFileUtility;
import Assessment012OrangeHRMPom.HomePage;
import Assessment012OrangeHRMPom.LoginPage;
import Assessment012OrangeHRMPom.MyInfoPage;

public class MyInfoTest extends BaseClass {

    @Test
    public void updateMyInfoTest() throws IOException, InterruptedException {

        String[] data = ExcelUtility.getData();

        String firstName = data[0];
        String lastName = data[1];
        String employeeId = data[2];

        // Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                PropertyFileUtility.getData("username"),
                PropertyFileUtility.getData("password")
        );

        Thread.sleep(5000);

        // My Info
        MyInfoPage myInfoPage = new MyInfoPage(driver);

        myInfoPage.clickMyInfo();

        // Clear and enter new data
        myInfoPage.changeFirstName(firstName);
        myInfoPage.changeLastName(lastName);
        myInfoPage.changeEmployeeId(employeeId);

        // Check data BEFORE SAVE
        System.out.println("Before Save:");
        System.out.println("First Name: " + myInfoPage.getFirstName());
        System.out.println("Last Name: " + myInfoPage.getLastName());
        System.out.println("Employee ID: " + myInfoPage.getEmployeeId());

        // Save
        myInfoPage.clickSave();

        Thread.sleep(5000);

        // Check data AFTER SAVE
        System.out.println("After Save:");
        System.out.println("First Name: " + myInfoPage.getFirstName());
        System.out.println("Last Name: " + myInfoPage.getLastName());
        System.out.println("Employee ID: " + myInfoPage.getEmployeeId());

        // Logout
        HomePage homePage = new HomePage(driver);

        homePage.logout();

        Thread.sleep(3000);

        // Login again
        loginPage.login(
                PropertyFileUtility.getData("username"),
                PropertyFileUtility.getData("password")
        );

        Thread.sleep(5000);

        // My Info again
        myInfoPage.clickMyInfo();

        Thread.sleep(3000);

        // Verify
        Assert.assertEquals(
                myInfoPage.getFirstName(),
                firstName
        );

        Assert.assertEquals(
                myInfoPage.getLastName(),
                lastName
        );

        Assert.assertEquals(
                myInfoPage.getEmployeeId(),
                employeeId
        );

        System.out.println("My Info details updated successfully");

        homePage.logout();
    }
}
