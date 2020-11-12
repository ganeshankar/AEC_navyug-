package AEC_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AEC_Base.AEC_base;

public class AEC_User_Management extends AEC_base{

	
	@FindBy(xpath= "//span[text()='+ Add New User']")
	WebElement add_new_user;
	
	@FindBy(xpath ="//select[@name ='title']")
	WebElement title;
	
	@FindBy(xpath ="//input[@name ='firstName']")
	WebElement firstname;
	
	@FindBy(xpath ="//input[@name ='lastName']")
	WebElement lastname;
	
	@FindBy(xpath ="//input[@name ='emailId']")
	WebElement email;
	
	@FindBy(xpath ="//input[@name ='mobileNumber']")
	WebElement mobileno;
	
	@FindBy(xpath ="//input[@name ='address']")
	WebElement address;
	
	@FindBy(xpath ="//select[@name ='role']")
	WebElement role;
	
	@FindBy(xpath ="//span[text()='Cancel']")
	WebElement cancel_button;
	
	@FindBy(xpath ="//span[text()='Send Request']")
	WebElement send_request_button;
	
	@FindBy(xpath ="//input[@placeholder='Search']")
	WebElement search_user;
	
	@FindBy(xpath ="//button[@aria-label='edit']/span")
	WebElement edit_user_account;
	
	@FindBy(xpath ="//button[@aria-label='delete']/span")
	WebElement delete_user_account;
	
	@FindBy(xpath ="//input[@type ='checkbox']")
	WebElement status_change_user;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement save_after_edit;
	
	@FindBy(xpath ="//span[text() = 'Sure']")
	WebElement sure_button_delete;
	
	@FindBy(xpath ="//div[@class='close--icon']")
	WebElement close_icon_delete;

	@FindBy(xpath= "//span[text()='User Management']")
	WebElement user_management_tab;
	
	public  AEC_User_Management() {
		PageFactory.initElements(driver, this);
	}
	
	public void addnewuserbutton() {
		add_new_user.click();
	}
	
	public void Addnewuser(String user_firstname, String user_lastname, String user_mobileno, String user_address) {
		Select se = new Select(title);
		se.selectByVisibleText("Miss.");
		firstname.sendKeys(Keys.CONTROL + "a");
		firstname.sendKeys(Keys.DELETE);
		firstname.sendKeys(user_firstname);
		lastname.sendKeys(Keys.CONTROL + "a");
		lastname.sendKeys(Keys.DELETE);
		lastname.sendKeys(user_lastname);
		mobileno.sendKeys(Keys.CONTROL + "a");
		mobileno.sendKeys(Keys.DELETE);
		mobileno.sendKeys(user_mobileno);
		address.sendKeys(Keys.CONTROL + "a");
		address.sendKeys(Keys.DELETE);
		address.sendKeys(user_address);
		Select se1 = new Select(role);
		se1.selectByVisibleText("manager");
	}
	
	public void useremailid(String user_email) {
		email.sendKeys(user_email);
	}
	
	public void sendrequest() {
		send_request_button.click();
	}
	
	public void cancelrequest() {
		cancel_button.click();
	}
	
	public void searchuser(String user_email) {
		search_user.sendKeys(user_email);
	}
	
	public void edituseraccount() {
		edit_user_account.click();
	}
	
	public void deleteuseraccount() {
		delete_user_account.click();
	}
	
	public void statususeraccount() {
		status_change_user.click();
	}
	
	public void saveafteredit() {
		save_after_edit.click();
	}
	
	public void navigateusermanagement() {
		user_management_tab.click();
	}
}
