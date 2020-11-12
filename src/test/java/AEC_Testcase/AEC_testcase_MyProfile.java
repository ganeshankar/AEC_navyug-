package AEC_Testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import AEC_Base.AEC_base;
import AEC_Pages.AEC_Myprofile;
import AEC_Pages.AEC_login;

public class AEC_testcase_MyProfile extends AEC_base {

	AEC_Myprofile myprofile;
	AEC_login login;
	
	public AEC_testcase_MyProfile() {
		super();
	}
	
	@BeforeMethod()
	public void setup() throws InterruptedException {
		initialization();
		login = new AEC_login();
		login.login(prop.getProperty("user_email_id"), prop.getProperty("user_password"));
		myprofile = new AEC_Myprofile();
		myprofile.navigatetoeditprofile();	
	}
	
	@Test(priority =1)
	public void mandatory_fields() {
		myprofile.editusermandatoryfields(prop.getProperty("user_firstname"), prop.getProperty("user_mobileno"));
		Boolean actual_result = myprofile.editprofielinkenable();
		Assert.assertTrue(actual_result);
	}
	
	@Test(priority =2)
	public void mandatory_user_firstname_errorcheck() {
		myprofile.editusermandatoryfields(prop.getProperty("user_firstname_blank"), prop.getProperty("user_mobileno"));
		String actual_message = myprofile.mandatoryerrormessage();
		Assert.assertEquals(actual_message, prop.getProperty("expected_message"));
	}
	
	@Test(priority =3)
	public void mandatory_user_mobile_errorcheck1() {
		myprofile.editusermandatoryfields(prop.getProperty("user_firstname"), prop.getProperty("user_mobileno_blank"));
		String actual_message = myprofile.mandatoryerrormessage();
		Assert.assertEquals(actual_message, prop.getProperty("expected_message"));
	}
	
	@Test(priority =4)
	public void all_field_edit_save() {
		myprofile.updateuserprofile(prop.getProperty("user_firstname"), prop.getProperty("user_lastname"), prop.getProperty("user_dob"), 
		                        prop.getProperty("user_mobileno"), prop.getProperty("user_language"), prop.getProperty("user_address"));
		Boolean actual_result = myprofile.editprofielinkenable();
		Assert.assertTrue(actual_result);
	}
	
	@Test(priority = 3)
	public void all_field_edit_cancel() {
		myprofile.cancelupdateuserprofile(prop.getProperty("user_firstname"), prop.getProperty("user_lastname"), prop.getProperty("user_dob"), 
				prop.getProperty("user_mobileno"), prop.getProperty("user_language"), prop.getProperty("user_address"));
		Boolean actual_result = myprofile.editprofielinkenable();
		Assert.assertTrue(actual_result);
	}
	
	@Test(priority =4)
	public void upload_profile_pic() throws IOException {
		myprofile.editusermandatoryfields(prop.getProperty("user_firstname"), prop.getProperty("user_mobileno"));
		myprofile.uploadphoto(prop.getProperty("user_profile_pic"));
		Boolean actual_result = myprofile.editprofielinkenable();
		Assert.assertTrue(actual_result);
	}
	
	@AfterMethod()
	public void close() {
		driver.quit();
	}
}
