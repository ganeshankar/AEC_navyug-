package AEC_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AEC_Base.AEC_base;

public class AEC_Portal_setting extends AEC_base{

	@FindBy(xpath ="//label[@class='choose-file']")
	WebElement choose_file_logo;
	
	@FindBy(xpath = "//span[text()='Portal Setting']")
	WebElement navigate_portal_setting;
	
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement cancel_button;
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement save_button;
	
	public AEC_Portal_setting() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigatetoportalsetting() {
		navigate_portal_setting.click();
	}

	public void choosefile() throws IOException {
		choose_file_logo.click();
		
	}
	
	public void savebutton() {
		save_button.click();
	}
	
	public void cancelbutton() {
		cancel_button.click();
	}
	
}