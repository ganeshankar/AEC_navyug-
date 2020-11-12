package AEC_Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AEC_Base.AEC_base;

public class AEC_Myprofile extends AEC_base {

	
	@FindBy (xpath="//div[@class = 'logedin-user-container']/child::div[3]/div/div")
	WebElement drop_down;
	
	@FindBy (xpath="//span[text()='Account Setting']")
	WebElement account_setting ;
	
	@FindBy (xpath="//div[@class= 'edit-profile']")
	WebElement edit_profile_link;
	
	@FindBy (xpath="//select[@name= 'title']")
	WebElement title;
	
	@FindBy (xpath="//input[@name= 'firstName']")
	WebElement firstname;
	
	@FindBy (xpath="//input[@name= 'lastName']")
	WebElement lastname;
	
	@FindBy (xpath="//input[@name= 'dateOfBirth']")
	WebElement DOB;
	
	@FindBy (xpath="//input[@name= 'mobileNumber']")
	WebElement mobileno;
	
	@FindBy (xpath="//input[@name= 'firstLanguage']")
	WebElement first_language;
	
	@FindBy (xpath="//input[@name= 'address']")
	WebElement address;
	
	@FindBy (xpath="//select[@name= 'role']")
	WebElement role;
	
	@FindBy (xpath="//select[@name= 'nationality']")
	WebElement country_of_citizenship;
	
	@FindBy (xpath="//select[@name= 'countryOfBusiness']")
	WebElement country_of_business;
	
	@FindBy (xpath="//div[@class='upload-icon']")
	WebElement upload_profile_image;
	
	@FindBy (xpath="//span[text()='Cancel']")
	WebElement cancel_button;
	
	@FindBy (xpath="//span[text()='Save']")
	WebElement save_button;

	@FindBy(xpath="//p[text()='This is required field']")
	WebElement mandatory_error_message;
	
	
	
	public AEC_Myprofile() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigatetoeditprofile() {
		drop_down.click();
		account_setting.click();
		edit_profile_link.click();
	}
	
	public void editusermandatoryfields(String userfirstname, String usermobileno) {
		firstname.sendKeys(Keys.CONTROL + "a");
        firstname.sendKeys(Keys.DELETE);
		firstname.sendKeys(userfirstname);
		mobileno.sendKeys(Keys.CONTROL + "a");
        mobileno.sendKeys(Keys.DELETE);
		mobileno.sendKeys(usermobileno);
		save_button.click();
	}
	
	public void updateuserprofile(String userfirstname, String userlastname, String userdob, String usermobileno, String userlangugae, String useraddress) {
    Select se = new Select(title);
    se.selectByVisibleText("Miss.");
    
    firstname.sendKeys(Keys.CONTROL + "a");
    firstname.sendKeys(Keys.DELETE);
	firstname.sendKeys(userfirstname);
	lastname.sendKeys(Keys.CONTROL + "a");
    lastname.sendKeys(Keys.DELETE);
	lastname.sendKeys(userlastname);
	DOB.sendKeys(Keys.CONTROL + "a");
    DOB.sendKeys(Keys.DELETE);
	DOB.sendKeys(userdob);
	mobileno.sendKeys(Keys.CONTROL + "a");
    mobileno.sendKeys(Keys.DELETE);
	mobileno.sendKeys(usermobileno);
	first_language.sendKeys(Keys.CONTROL + "a");
    first_language.sendKeys(Keys.DELETE);
	first_language.sendKeys(userlangugae);
	address.sendKeys(Keys.CONTROL + "a");
    address.sendKeys(Keys.DELETE);
	address.sendKeys(useraddress);
	Select se1 = new Select(role);
	se1.selectByVisibleText("manager");
	Select se2 = new Select(country_of_citizenship);
	se2.selectByVisibleText("India");
	Select se3 = new Select(country_of_business);
	se3.selectByVisibleText("Bahamas");
	save_button.click();
		
	}
	

	public void cancelupdateuserprofile(String userfirstname, String userlastname, String userdob, String usermobileno, String userlangugae, String useraddress) {
		Select se = new Select(title);
	    se.selectByVisibleText("Mr.");  
	    firstname.sendKeys(Keys.CONTROL + "a");
        firstname.sendKeys(Keys.DELETE);
			firstname.sendKeys(userfirstname);
			lastname.sendKeys(Keys.CONTROL + "a");
		    lastname.sendKeys(Keys.DELETE);
			lastname.sendKeys(userlastname);
			DOB.sendKeys(Keys.CONTROL + "a");
		    DOB.sendKeys(Keys.DELETE);
			DOB.sendKeys(userdob);
			mobileno.sendKeys(Keys.CONTROL + "a");
		    mobileno.sendKeys(Keys.DELETE);
			mobileno.sendKeys(usermobileno);
			first_language.sendKeys(Keys.CONTROL + "a");
		    first_language.sendKeys(Keys.DELETE);
			first_language.sendKeys(userlangugae);
			address.sendKeys(Keys.CONTROL + "a");
		    address.sendKeys(Keys.DELETE);
			address.sendKeys(useraddress);
			Select se1 = new Select(role);
			se1.selectByVisibleText("senior counselor");
			Select se2 = new Select(country_of_citizenship);
			se2.selectByVisibleText("Ukraine");
			Select se3 = new Select(country_of_business);
			se3.selectByVisibleText("Australia");
			cancel_button.click();
	}

	public void uploadphoto(String profilepic) throws IOException {
		upload_profile_image.click();
		Runtime.getRuntime().exec(profilepic);
	}
	
	public String mandatoryerrormessage() {
	return	mandatory_error_message.getText();
	}
	
	public Boolean editprofielinkenable() {
		return edit_profile_link.isDisplayed();
	}




}
