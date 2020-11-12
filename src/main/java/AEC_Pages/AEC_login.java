package AEC_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AEC_Base.AEC_base;

public class AEC_login extends AEC_base{

	
	@FindBy(xpath="//input[@name ='email']")
	WebElement email;
	
	@FindBy(xpath ="//input[@name ='password']")
	WebElement password;
	
	@FindBy(xpath = "//span[text()= 'Login']")
	WebElement submit_button;
	
	@FindBy(xpath ="//span[text()= 'Forgot Password']")
	WebElement forget_password;
	
	@FindBy(xpath="//input[@name= 'email']")
	WebElement forget_password_email;
	
	@FindBy(xpath="//span[text()='Verify']")
	WebElement verify_button_forget_password;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement new_password_forget_password;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement confirm_password_forget_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement reset_password_button;
	
	@FindBy(xpath = "//span[text()='Back']")
	WebElement back_button_forget_password;
	
	@FindBy(xpath= "//div[text()='Invalid credentials. Please try again.']")
	WebElement invalid_credential_error;
	
	@FindBy(xpath ="//div[@class ='mail-sent']")
	WebElement email_sent_forget_password;
	
	@FindBy(xpath= "//div[@class='submit-error']")
	WebElement invalid_email_forget_password;
	
	@FindBy (xpath="//div[@class = 'logedin-user-container']/child::div[3]/div/div")
	WebElement drop_down;
	
	@FindBy (xpath="//span[text()='Account Setting']")
	WebElement account_setting ;
	
	
	public AEC_login() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String loginemail, String loginpassword) {
		email.sendKeys(loginemail);
		password.sendKeys(loginpassword);
		submit_button.click();
	}
	
	public void forgetpassword(String femail) {
		forget_password.click();
		forget_password_email.sendKeys(femail);
		verify_button_forget_password.click();	
	}
	
	public void resetpassword(String newpassword, String confirmpassword) {
		new_password_forget_password.sendKeys(newpassword);
		confirm_password_forget_password.sendKeys(confirmpassword);
		reset_password_button.click();	
	}
	
	public void backbutton() {
		forget_password.click();
		back_button_forget_password.click();
	}
	
	public String invalidcredentialmessage() {
	return invalid_credential_error.getText();
	}
	
	public String forgetpasswordmessage() {
	return email_sent_forget_password.getText();
	}
	
	public String invalidemailforgetpassword() {
		return invalid_email_forget_password.getText();
	}
	
	public void navigate_page() {
		drop_down.click();
		account_setting.click();
	}
}
