package Assessment8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testcase01 {
	WebDriver driver;
	public Testcase01(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = "[name='username']")
	private WebElement user;
	
	@FindBy(css = "[name='password']")
	private WebElement pass;
	
	
	@FindBy(css = "[type='submit']")
	private WebElement login;
	
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
	
	@FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
	private WebElement keywords;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement dateofApplecation;
	
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	private WebElement notes;
	
	
	@FindBy(xpath = "//div[@class='oxd-checkbox-wrapper']")
	private WebElement consent;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;
	
	@FindBy(xpath = "//a[text()='Candidates']")
	private WebElement candidates;
	
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

	public void getCandidates() {
		candidates.click();
	}

	public void getUser(String u) {
		user.sendKeys(u);
	}

	public void getPass(String p) {
		pass.sendKeys(p);
	}

	public void getLogin() {
		login.click();
	}

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

	public void getKeywords(String key) {
		keywords.sendKeys(key);
	}

	public void getDateofApplecation() {
		 dateofApplecation.click();
		 driver.findElement(By.xpath("//div[text()='Today']")).click();
	}


	public void getNotes(String note) {
		notes.sendKeys(note);
	}

	public void getConsent() {
		 consent.click();
	}

	public void getSave() {
		save.submit();
	}
	
	
}
