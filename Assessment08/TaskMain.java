package Assessment08;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskMain {

	public static void main(String[] args) throws IOException, InterruptedException {
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
		Task1 t=new Task1(driver);
		t.getUser(user);
		t.getPass(pass);
		t.getLogin();
		
		Task2 t2=new Task2(driver);
		t2.getRecruitment();
		t2.getAdd();

		t2.getFirstName(firstName);
		t2.getMiddleName(middleName);
		t2.getLastName(lastname);

		t2.getVacancy(2);

		t2.getEmail(email);
		t2.getContactNumber(contactNumber);

		t2.getResume();


		t2.getDateofApplecation();

		t2.getSave();

		t2.getCandidates();
		
		Thread.sleep(2000);
		Task3 t3=new Task3(driver);
		
		Thread.sleep(2000);

		t3.getJobtitle(0);
		t3.getVacancy1(2);
		t3.getHiringmanager(1);
		t3.getStatus(1);

		t3.getCadidateName(CadidateName);

		t3.getDateofapplication2();

		t3.getSearch();

		Thread.sleep(2000);
		
		
		
		if (t3.verifyCandidate()) {
		    System.out.println("Candidate added successfully");
		} else {
		    System.out.println("Candidate not found");
		}

	}

}
