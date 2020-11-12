package AEC_Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AEC_Base.AEC_base;

public class AEC_search extends AEC_base {

	@FindBy(xpath = "//input[@class='no-suggestion']")
	WebElement search_box;
	
	@FindBy(xpath = "//ul[@class='suggestions']/li")
	WebElement select_suggestion;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement search_button;
	
	@FindBy(xpath = "//p[text()='Intake ']/parent::div/parent::div/following-sibling::div/child::div/div/div/div/p/fieldset/child::div/label/span/span/input")
	List<WebElement> intake;
	
	@FindBy(xpath = "//p[text()='Delivery Method ']/parent::div/parent::div/following-sibling::div/child::div/div/div/div/p/fieldset/child::div/label/span/span/input")
	List<WebElement> delivery_method;
	
	@FindBy(xpath = "//p[text()='Current Status ']/parent::div/parent::div/following-sibling::div/child::div/div/div/div/p/fieldset/child::div/label/span/span/input")
	List<WebElement> current_status;
	
	@FindBy(xpath = "//p[text()='Course Level ']/parent::div/parent::div/following-sibling::div/child::div/div/div/div/p/fieldset/child::div/label/span/span/input")
	List<WebElement> course_level;
	
	@FindBy(xpath = "//p[text()='Application Requirements ']/parent::div/parent::div/following-sibling::div/child::div/div/div/div/p/fieldset/child::div/label/span/span/input")
	List<WebElement> application_requirement;
	
	@FindBy(xpath ="//p[text()='Tuition Fee']/parent::div/parent::div/following-sibling::div/div/div/div/div/p/div/span/child::span[8]")
	WebElement tuition_fee;
	
	@FindBy(xpath ="//p[text()='Duration']/parent::div/parent::div/following-sibling::div/div/div/div/div/p/div/span/child::span[8]")
	WebElement duration;
	
	@FindBy(xpath ="//p[text()='Internship Period']/parent::div/parent::div/following-sibling::div/div/div/div/div/p/div/span/child::span[8]")
	WebElement internship_peroid;
	
	@FindBy(xpath ="//p[text()='Application Fee']/parent::div/parent::div/following-sibling::div/div/div/div/div/p/div/span/child::span[8]")
	WebElement application_fee;
	
	@FindBy(xpath = "//div[@class= 'result-count']")
	WebElement result;
	
	public AEC_search() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigatetosearch(String university_name ) throws InterruptedException {
		search_box.sendKeys(university_name);
		Thread.sleep(2000);
		select_suggestion.click();
		search_button.click();
	}
	
	
	public void intakefilter(String intake_value) {
		
		List<WebElement> l1 = intake;
		int a = l1.size();
	    l1.get(a-Integer.parseInt(intake_value)).click();
	}
	
public void deliverymethod(String delivery_method_value) {
		
		List<WebElement> l1 = delivery_method;
		int b = l1.size();
	    l1.get(b-Integer.parseInt(delivery_method_value)).click();
	}

public void currentstatus(String current_status_value) {
	
	List<WebElement> l1 = current_status;
	int c = l1.size();
    l1.get(c-Integer.parseInt(current_status_value)).click();
}

public void courselevel(String course_level_value) {
	
	List<WebElement> l1 = course_level;
	int d = l1.size();
    l1.get(d-Integer.parseInt(course_level_value)).click();
}

public void applicationrequirement(String application_requirement_value) {
	
	List<WebElement> l1 = application_requirement;
	int e = l1.size();
    l1.get(e-Integer.parseInt(application_requirement_value)).click();
}

public void tuitionfee(String tuition_value) {
	Actions at =new Actions(driver);
	at.dragAndDropBy(tuition_fee, Integer.parseInt(tuition_value), 0);
	at.perform();
}

public void duration(String duration_value) {
	Actions at =new Actions(driver);
	at.dragAndDropBy(duration, Integer.parseInt(duration_value), 0);
	at.perform();
}

public void internshipperiod(String internship_value) {
	Actions at =new Actions(driver);
	at.dragAndDropBy(internship_peroid, Integer.parseInt(internship_value), 0);
	at.perform();
}

public void applicationfee(String application_value) {
	Actions at =new Actions(driver);
	at.dragAndDropBy(application_fee, Integer.parseInt(application_value), 0);
	at.perform();
}
	
public String result() {
	return result.getText();
}

}
