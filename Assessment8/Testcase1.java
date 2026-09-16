package Assessment8;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testcase1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream file=new FileInputStream("./src/test/resources/DD/Data1.properties");
		Properties p=new Properties();
		p.load(file);
		String Browser = p.getProperty("Browser");
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String pass = p.getProperty("pass");
		String firstName = p.getProperty("firstName");
		String middleName = p.getProperty("middleName");
		String lastname = p.getProperty("lastname");
		String email = p.getProperty("email");
		String contactNumber = p.getProperty("contactNumber");
		String keyword = p.getProperty("keyword");
		String notes = p.getProperty("notes");
		String CadidateName = p.getProperty("CadidateName");
		
		WebDriver driver=null;
		if(Browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Testcase01 d=new Testcase01(driver);
		d.getUser(user);
		d.getPass(pass);
		d.getLogin();

		d.getRecruitment();
		d.getAdd();

		d.getFirstName(firstName);
		d.getMiddleName(middleName);
		d.getLastName(lastname);

		d.getVacancy(2);

		d.getEmail(email);
		d.getContactNumber(contactNumber);

		d.getResume();

		d.getKeywords(keyword);

		d.getDateofApplecation();

		d.getNotes(notes);

		d.getConsent();
		d.getSave();

		d.getCandidates();
		
		Thread.sleep(2000);

		d.getJobtitle(0);
		d.getVacancy1(2);
		d.getHiringmanager(1);
		d.getStatus(1);

		d.getCadidateName(CadidateName);

		d.getDateofapplication2();

		d.getSearch();

		Thread.sleep(2000);
		
		
		
		if (d.verifyCandidate()) {
		    System.out.println("Candidate added successfully");
		} else {
		    System.out.println("Candidate not found");
		}

	}

}
