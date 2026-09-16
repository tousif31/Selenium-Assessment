package Assessment08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task3 {
	
	WebDriver driver;
	public Task3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement jobtitle;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement vacancy1;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")
	private WebElement hiringmanager;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")
	private WebElement status;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement cadidateName;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement Dateofapplication2;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement search;
	
	
	@FindBy(xpath = "//div[@role='row']//div[contains(text(),'mahammed tousif phatan')]")
	private WebElement candidateRecord;
	
	
	
	
	public boolean verifyCandidate() {
	    return candidateRecord.isDisplayed();
	}
	
	
	public void getJobtitle(int index) throws InterruptedException {

	    jobtitle.click();

	    Thread.sleep(1000);

	    List<WebElement> options =
	        driver.findElements(By.xpath("//div[@role='option']"));

	    System.out.println("Job title options found: " + options.size());

	    options.get(index).click();
	}

	public void getVacancy1(int index) {
		vacancy1.click();
		List<WebElement> options =driver.findElements(By.xpath("//div[@role='option']"));
	    options.get(index).click();
	}

	public void getHiringmanager(int index) throws InterruptedException {

	    hiringmanager.click();

	    Thread.sleep(1000);

	    List<WebElement> options =
	        driver.findElements(By.xpath("//div[@role='option']"));

	    System.out.println("Hiring Manager options found: " + options.size());

	    options.get(index).click();
	}

	public void getStatus(int index) {
		status.click();
		List<WebElement> options =driver.findElements(By.xpath("//div[@role='option']"));
	    options.get(index).click();
	}

	
	public void getCadidateName(String name) throws InterruptedException {

	    cadidateName.sendKeys(name);

	    Thread.sleep(2000);

	    List<WebElement> options =
	        driver.findElements(By.xpath("//div[contains(@class,'oxd-autocomplete-option')]"));

	    System.out.println("Candidate options: " + options.size());

	    options.get(0).click();
	}

	public void getDateofapplication2() {
		Dateofapplication2.click();
		driver.findElement(By.xpath("//div[text()='Today']")).click();
	}

	public void getSearch() {
		search.click();
	}

}
