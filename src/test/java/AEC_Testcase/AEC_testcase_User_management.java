package AEC_Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AEC_Base.AEC_base;
import AEC_Pages.AEC_User_Management;
import AEC_Pages.AEC_login;

public class AEC_testcase_User_management extends AEC_base {

	AEC_login loginpage;
	AEC_User_Management usermanag;
	
	
	public AEC_testcase_User_management() {
		super();
	}
	
	@BeforeMethod()
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new AEC_login();
		loginpage.login(prop.getProperty("user_email_id"), prop.getProperty("user_password"));
		loginpage.navigate_page();
		usermanag =  new AEC_User_Management();
		usermanag.navigateusermanagement();
	}
	
	@Test(priority =1)
	public void add_new_user() {
	usermanag.addnewuserbutton();
	usermanag.Addnewuser(prop.getProperty("um_user_firstname"), prop.getProperty("um_user_lastname"), prop.getProperty("um_user_mobileno"), prop.getProperty("um_user_address"));
	usermanag.useremailid(prop.getProperty("um_user_email"));
	usermanag.sendrequest();
}
	
	@Test(priority =2)
	public void cancel_new_user() {
		usermanag.addnewuserbutton();
		usermanag.Addnewuser(prop.getProperty("um_user_firstname"), prop.getProperty("um_user_lastname"), prop.getProperty("um_user_mobileno"), prop.getProperty("um_user_address"));
		usermanag.useremailid(prop.getProperty("um_user_email"));
		usermanag.sendrequest();
	}
	
	@Test(priority =3)
	public void edit_user_account() {
		usermanag.searchuser(prop.getProperty("edit_user_email"));
		usermanag.edituseraccount();
		usermanag.Addnewuser(prop.getProperty("eum_user_firstname"), prop.getProperty("eum_user_lastname"), prop.getProperty("eum_user_mobileno"), prop.getProperty("eum_user_address"));
	    usermanag.saveafteredit();
	}
	
    @Test(priority =4)
	public void change_status_user_account() {
		usermanag.searchuser(prop.getProperty("status_user_email"));
		usermanag.statususeraccount();
	}
	
    @Test(priority =5)
	public void delete_user_account() {
		usermanag.searchuser(prop.getProperty("delete_user_email"));
		usermanag.deleteuseraccount();
	}
	

	
}