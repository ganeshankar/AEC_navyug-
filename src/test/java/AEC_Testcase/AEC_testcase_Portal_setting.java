package AEC_Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AEC_Base.AEC_base;
import AEC_Pages.AEC_Portal_setting;
import AEC_Pages.AEC_login;

public class AEC_testcase_Portal_setting extends AEC_base{
 
	AEC_login loginpage;
	AEC_Portal_setting portalpage;
	
	public AEC_testcase_Portal_setting() {
		super();
	}
	
	@BeforeMethod()
	public void setup() {
		initialization();
		loginpage = new AEC_login();
		loginpage.login(prop.getProperty("user_email_id"), prop.getProperty("user_password"));
		loginpage.navigate_page();
	portalpage =new AEC_Portal_setting();
	portalpage.navigatetoportalsetting();
	
	}
	
	@Test(priority =1)
	public void upload_portal_logo() throws IOException, InterruptedException {
		portalpage.choosefile();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\data\\logoofportal.exe");
		Thread.sleep(10000);
		portalpage.savebutton();
	}
	
	@Test(priority =2)
	public void cancel_upload_poral_logo() throws IOException, InterruptedException {
		portalpage.choosefile();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\data\\logoofportal1.exe");
		Thread.sleep(10000);
		portalpage.cancelbutton();
	}
	
	@AfterMethod()
	public void close() {
		driver.quit();
	}
	
}
