package Assessment2Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Assessment2Base.BaseClass;
import Assessment2Data.ExcelUtility;
import Assessment2Pom.BuzzLink;
import Assessment2Pom.HomePage;



public class TestOrangeHRM extends BaseClass {
	
	@Test
	public void test1() throws IOException, InterruptedException {
        String[] data = ExcelUtility.getData();
        String mind = data[0];
        
        BuzzLink b=new BuzzLink(driver);
        b.getBuzz();
        Thread.sleep(3000);
        
        b.getEnterdata(mind);
        Thread.sleep(3000);
        
        b.getPost();
        
        Thread.sleep(3000);
        
        b.verify(mind);
        
        
	}
}