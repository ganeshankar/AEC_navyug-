package AEC_Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AEC_Base.AEC_base;
import AEC_Pages.AEC_login;


public class AEC_testcase_login extends AEC_base{

	AEC_login loginpage;
	
	public AEC_testcase_login() {
		super();
	}
	
	@BeforeMethod()
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new AEC_login();
	}
	
	@Test(priority =1)
	public void login_with_valid_user() {
	loginpage.login(prop.getProperty("user_email_id"),prop.getProperty("user_password"));
	String actual_result = driver.getTitle();
	System.out.println(actual_result );
	}
	
	@Test(priority =2)
	public void login_with_invalid_user() {
	loginpage.login(prop.getProperty("invalid_email_id"),prop.getProperty("user_password"));
	String expected_message= "Invalid credentials. Please try again.";
	String actual_message = loginpage.invalidcredentialmessage();
	Assert.assertEquals(actual_message, expected_message);
	}
	
	@Test(priority =3)
	public void login_with_wrong_password() {
	loginpage.login(prop.getProperty("user_email_id"),prop.getProperty("wrong_password"));
	String expected_message = "Invalid credentials. Please try again.";
	String actual_message = loginpage.invalidcredentialmessage();
	Assert.assertEquals(actual_message, expected_message);
	}
	
	@Test(priority = 4)
	public void reset_password() {
		loginpage.forgetpassword(prop.getProperty("forget_email"));
		String expected_message = "A link has been sent to email id \"ganesh.shankar+3@navyuginfo.com\" open the link to set new password";
		String actual_message = loginpage.forgetpasswordmessage();
		Assert.assertEquals(actual_message, expected_message);
	}
	
	@Test(priority = 5)
	public void invalid_reset_password() {
		loginpage.forgetpassword(prop.getProperty("invalid_email_id"));
		String expected_message = "Email id does not exist!";
		String actual_message = loginpage.invalidemailforgetpassword();
		Assert.assertEquals(actual_message, expected_message);
	}
	
	@Test(priority = 6)
	public void back_button_forget_password() {
	loginpage.backbutton();
	String actual_result = driver.getTitle();
	System.out.println(actual_result);
	String expected_result = "AEC";
	Assert.assertEquals(actual_result, expected_result);
	}
	
	@AfterMethod()
	public void close() {
	driver.quit();
	}

}
