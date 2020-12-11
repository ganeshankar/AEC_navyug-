package AEC_Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AEC_Base.AEC_base;

public class AEC_add_student extends AEC_base{

	@FindBy(xpath = "//span[text()='Students']/parent::a")
	WebElement student;
	
	@FindBy(xpath = "//span[text()='+ Add New Student']")
	WebElement add_new_student_button;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement student_emailid;
	
	@FindBy(xpath = "//select[@name='title']")
	WebElement title;
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastname;
	
	@FindBy(xpath = "//select[@name='gender']")
	WebElement gender;
	
	@FindBy(xpath = "//input[@id='dateOfBirth']")
	WebElement dob;
	
	@FindBy(xpath = "//select[@name='nationality']")
	WebElement nationality;
	
	@FindBy(xpath = "(//input[@type='tel'])[1]")
	WebElement mobile_number;
	
	@FindBy(xpath = "(//input[@type='tel'])[2]")
	WebElement alternative_number;
	
	@FindBy(xpath = "//input[@id='passportNumber']")
	WebElement passport_number;
	
	@FindBy(xpath = "//select[@name='country']")
	WebElement country;
	
	@FindBy(xpath = "//select[@name='state']")
	WebElement state;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@id='address']")
	WebElement house_no;
	
	@FindBy(xpath = "//input[@id='pinCode']")
	WebElement pincode;
	
	@FindBy(xpath = "//span[text()='Save & Next']")
	WebElement save_and_next_button;
	
	@FindBy(xpath = "//select[@name='currentQualification']")
	WebElement current_qualification;
	
	@FindBy(xpath = "//input[contains(@id,'educationDetails')]")
	List<WebElement> educationdetailtextfield;
	
	@FindBy(xpath = "//select[contains(@name,'educationDetails')]")
	List<WebElement> educationdetailselectfield;
	
	@FindBy(xpath = "//input[@id='remarks']")
	WebElement remark_related_to_acedemic;
	
	
	// Test score //
	
	@FindBy(xpath = "//select[@name='englishTestName']")
	WebElement select_your_eng_test;
	
	@FindBy(xpath = "//select[@name='overallScore']")
	WebElement overall_score;
	
	@FindBy(xpath = "//select[@name='listeningScore']")
	WebElement listening_score;
	
	@FindBy(xpath = "//select[@name='readingScore']")
	WebElement reading_score;
	
	@FindBy(xpath = "//select[@name='writingScore']")
	WebElement writing_score;
	
	@FindBy(xpath = "//select[@name='speakingScore']")
	WebElement speaking_score;
	
	@FindBy(xpath = "//input[@id='dateOfExamination']")
	WebElement date_of_exam;
	
	@FindBy(xpath = "//select[contains(@name,'otherExams')]")
	List<WebElement> enterance_exam_select;
	
	@FindBy(xpath = "//input[contains(@id,'otherExams')]")
	WebElement date_of_entrance_exam;
	
	@FindBy(xpath ="//div[text()='+ Add More']")
	WebElement add_more_button;
	
	// work experience //
	
	@FindBy(xpath ="//select[@name='totalYearOfExp']")
	WebElement total_year_of_work_exp;
	
	@FindBy(xpath ="//input[contains(@id,'workExperienceList')]")
	List<WebElement> work_exp_fields;
	
	@FindBy(xpath ="//div[text()='+ Add More Employers']")
	WebElement add_more_employes_button;
	
	
	public void student() {
		student.click();
	}
	
	public  AEC_add_student() {
		PageFactory.initElements(driver, this);
	}
	
	public void addstudent() {
		add_new_student_button.click();
	}
	
	public void generalinformationpage(String emailid, String stud_title, String stud_firstname, String stud_lastname,String stud_gender, String stud_dob, String stud_nationality, String stud_mobile,  
			String stud_alt_no, String stud_passport, String stud_country, String stud_state, String stud_city, String stud_houseno, String stud_pincode) throws InterruptedException {
		student_emailid.sendKeys(emailid);
		Select se1 = new Select(title);
		se1.selectByValue(stud_title);
		firstname.sendKeys(stud_firstname);
		lastname.sendKeys(stud_lastname);
		Select se2 = new Select(gender);
		se2.selectByVisibleText(stud_gender);
		dob.sendKeys(stud_dob);
		Select se3 = new Select(nationality);
		se3.selectByVisibleText(stud_nationality);
		mobile_number.sendKeys(stud_mobile);
		alternative_number.sendKeys(stud_alt_no);
		passport_number.sendKeys(stud_passport);
		Select se4 = new Select(country);
		se4.selectByVisibleText(stud_country);
		Thread.sleep(5000);
		Select se5 = new Select(state);
		se5.selectByVisibleText(stud_state);
		city.sendKeys(stud_city);
		house_no.sendKeys(stud_houseno);
		pincode.sendKeys(stud_pincode);
		
	}
	
	public void submitbutton() {
		save_and_next_button.click();
	}
	
	public void educationhistorypage(String current_qualification1) {
		Select se1 = new Select(current_qualification);
		se1.selectByVisibleText(current_qualification1);
	}
	
	public void class_education_value(String fieldno, String edu_value) {
		
		List<WebElement> l1 = educationdetailtextfield;
		int a = l1.size();
	    l1.get(a-Integer.parseInt(fieldno)).sendKeys(edu_value);
	}
		
	public void class_education_select(String fieldno, String edu_data) {
		List<WebElement> l1 = educationdetailselectfield;
		int a = l1.size();
	    Select se1 = new Select(l1.get(a-Integer.parseInt(fieldno)));
	    se1.selectByVisibleText(edu_data);
	}
	
	public void test_score(String english_test_value, String overall_value, String listening_value, String reading_value, String writing_value, String speaking_value, String dateofexam) {
		Select se1 = new Select(select_your_eng_test);
		se1.selectByVisibleText(english_test_value);
		Select se2 = new Select(overall_score);
		se2.selectByVisibleText(overall_value);
		Select se3 = new Select(listening_score);
		se3.selectByVisibleText(listening_value);
		Select se4 = new Select(reading_score);
		se4.selectByVisibleText(reading_value);
		Select se5 = new Select(writing_score);
		se5.selectByVisibleText(writing_value);
		Select se6 = new Select(speaking_score);
		se6.selectByVisibleText(speaking_value);
		date_of_exam.sendKeys(dateofexam);
	}
	
	public void test_score_entrance_exam(String fieldno, String entrance_data ,String dateofentrance) {
		List<WebElement> L1 = enterance_exam_select;
		int a = L1.size();
		Select se1= new Select(L1.get(a-Integer.parseInt(fieldno)));
		se1.selectByVisibleText(entrance_data);
		date_of_entrance_exam.sendKeys(dateofentrance);
	}
	
	public void test_score_add_more() {
		add_more_button.click();
	}
		
	public void work_experience_total_exp(String totalyearexp) {
		Select se1 = new Select(total_year_of_work_exp);
		se1.selectByVisibleText(totalyearexp);
	}
	
	public void work_experience_employee( String fieldno, String exp_value) {
		List<WebElement> l1 =  work_exp_fields;
		int a = l1.size();
		l1.get(a-Integer.parseInt(fieldno)).sendKeys(exp_value);
	}
	
	public void work_experience_add_member() {
		add_more_employes_button.click();
	}
}
