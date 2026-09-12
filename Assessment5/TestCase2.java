package Assessment5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file=new FileInputStream("./src/test/resources/DD/Excel2.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		String Browser = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String url = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		String user = wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		String pass = wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		String Chrome = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String url1 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String Password = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	
		System.out.println(Chrome+url1+username+Password);
		
		WebDriver driver=null;
		
		if(Chrome.equals("chrome")) {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username,Keys.TAB,Password);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}

}
