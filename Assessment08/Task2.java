package Assessment08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task2 {
	
	WebDriver driver;
	public Task2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[5]")
	private WebElement Recruitment;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	private WebElement add;
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement middleName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	private WebElement vacancy;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Email;
	
	@FindBy(xpath = "(//input[@placeholder='Type here'])[2]")
	private WebElement contactNumber;
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement resume;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement dateofApplecation;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;
	
	@FindBy(xpath = "//a[text()='Candidates']")
	private WebElement candidates;
	
	public void getRecruitment() {
		Recruitment.click();
	}

	public void getAdd() {
		add.click();
	}

	public void getFirstName(String fn) {
		firstName.sendKeys(fn);
	}

	public void getMiddleName(String mn) {
		middleName.sendKeys(mn);
	}

	public void getLastName(String ln) {
		lastName.sendKeys(ln);
	}

	public void getVacancy(int index) throws InterruptedException {

	    vacancy.click();

	    Thread.sleep(1000);

	    List<WebElement> options =
	        driver.findElements(By.xpath("//div[@role='option']"));

	    System.out.println("Options found: " + options.size());

	    options.get(index).click();
	}

	public void getEmail(String e) {
		Email.sendKeys(e);
	}

	public void getContactNumber(String num) {
		 contactNumber.sendKeys(num);
	}

	public void getResume() {
		resume.sendKeys("C:\\Users\\Hp\\Downloads\\Tousif2026.pdf");
	}
	
	public void getDateofApplecation() {
		 dateofApplecation.click();
		 driver.findElement(By.xpath("//div[text()='Today']")).click();
	}
	
	public void getSave() {
		save.submit();
	}
	
	
	public void getCandidates() {
		candidates.click();
	}

}
