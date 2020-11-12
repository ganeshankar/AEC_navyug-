package AEC_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AEC_Base.AEC_base;

public class AEC_join_as_agency extends AEC_base{
	
	@FindBy(xpath ="(//span['Join us as Agency'])[8]/parent::span/parent::button")
	WebElement joinasagency;

	@FindBy(xpath ="//input[@name ='name']")
	WebElement agency_name;
	
	@FindBy(xpath ="//input[@name ='address']")
	WebElement address_line1;
	
	@FindBy(xpath ="//label[text()='Country *']/parent::div/div/select")
	WebElement country;
	
	@FindBy(xpath ="//label[text()='State *']/parent::div/div/select")
	WebElement state;
	
	@FindBy(xpath ="//input[@name ='city']")
	WebElement city;
	
	@FindBy(xpath ="//input[@name ='pincode']")
	WebElement pincode;
	
	@FindBy(xpath ="//input[@name ='website']")
	WebElement website;
	
	@FindBy(xpath ="(//input[@name='email'])[2]")
	WebElement email;
	
	@FindBy(xpath ="//input[@name ='landlineNumber']")
	WebElement landline_number;
	
	@FindBy(xpath ="//label[text()='Main Countries of Interest']/parent::div/div/div")
	WebElement country_of_interest;
	
	@FindBy(xpath ="//ul[@role='listbox']/li")
	WebElement select_country_of_interest;
	
	@FindBy(xpath ="//label[text()='Established in']/parent::div/div/select")
	WebElement establishedin;
	
	@FindBy(xpath ="//input[@name ='instituteName']")
	WebElement institute_name;
	
	@FindBy(xpath ="//label[text()='Country']/parent::div/div/select")
	WebElement institute_country;
	
	@FindBy(xpath ="//input[@name ='facebookPageUrl']")
	WebElement facebook_page_url;
	
	@FindBy(xpath ="//input[@name ='instagramHandleUrl']")
	WebElement instagram_page_url;
	
	@FindBy(xpath ="//label[text()='Title *']/parent::div/div/select")
	WebElement director_title;
	
	@FindBy(xpath ="//input[@name ='directorFirstName']")
	WebElement director_firstname;
	
	@FindBy(xpath ="//input[@name ='directorLastName']")
	WebElement director_lastname;
	
	@FindBy(xpath ="//input[@name ='directorEmailId']")
	WebElement director_emailid;
	
	@FindBy(xpath ="//input[@name ='directorMobileNumber']")
	WebElement director_mobileno;
	
	@FindBy(xpath ="//label[text()='Total number of employees']/parent::div/div/select")
	WebElement total_number_of_employee;
	
	@FindBy(xpath ="//input[@name ='otherBranches']")
	WebElement other_branches;
	
	@FindBy(xpath ="(//input[@name ='companyProfile'])[1]")
	WebElement company_profile;
	
	@FindBy(xpath ="(//input[@name ='businessCertificate'])[1]")
	WebElement business_certificate;
	
	@FindBy(xpath ="//input[@name ='lastYearStudentNo']")
	WebElement last_year_studentno;
	
	@FindBy(xpath ="//span[text()='Join Now']")
	WebElement join_now_button;
	
	@FindBy(xpath ="//span[text() ='Agency Details']")
	WebElement agency_detail_text;
	
	@FindBy(xpath ="//span[text()='OK']")
	WebElement confirm_join_agency;
	
	@FindBy(xpath ="//div[text()='This Agency is already present']")
	WebElement error_message;
	
	public AEC_join_as_agency() {
		PageFactory.initElements(driver, this);
	}
	
	public void join_agency_button() throws InterruptedException {
		joinasagency.click();
		Thread.sleep(5000);
	}
	
	public void join_as_agency_mandatory_field(String agencyname,String address, String country_name, String state_name, String city_name, 
			String pincode_no, String email_id, String title, String dir_firstname, String dir_emailid, String dir_mobileno) throws InterruptedException {
	
	
	agency_name.sendKeys(agencyname);
	address_line1.sendKeys(address);
	Select se1 = new Select(country);
	se1.selectByVisibleText(country_name);
	
	Select se2 = new Select(state);
	se2.selectByVisibleText(state_name);
	city.sendKeys(city_name);
	pincode.sendKeys(pincode_no);
	email.sendKeys(email_id);
	Select se3 = new Select(director_title);
	se3.selectByVisibleText(title);
	director_firstname.sendKeys(dir_firstname);
	director_emailid.sendKeys(dir_emailid);
	director_mobileno.sendKeys(dir_mobileno);
	
	}
	
	public void join_as_agency_all_field(String agencyname,String address, String country_name, String state_name, String city_name, 
			String pincode_no,String agency_website ,String email_id, String landline,String established, String inst_name,String inst_country, 
			String face_url, String insta_url,String title, String dir_firstname,String dir_lastname, String dir_emailid, String dir_mobileno,
			String total_employee ,String oth_branches,String lst_year_studentno) throws InterruptedException {
		
		agency_name.sendKeys(agencyname);
		address_line1.sendKeys(address);
		Select se1 = new Select(country);
		se1.selectByVisibleText(country_name);
		
		Select se2 = new Select(state);
		se2.selectByVisibleText(state_name);
		city.sendKeys(city_name);
		pincode.sendKeys(pincode_no);
		website.sendKeys(agency_website);
		email.sendKeys(email_id);
		landline_number.sendKeys(landline);
		
		Select se4= new Select(establishedin);
		se4.selectByVisibleText(established);
		institute_name.sendKeys(inst_name);
		Select se5 = new Select(institute_country);
		se5.selectByVisibleText(inst_country);
		
		facebook_page_url.sendKeys(face_url);
		instagram_page_url.sendKeys(insta_url);
		Select se6 = new Select(director_title);
		se6.selectByVisibleText(title);
		director_firstname.sendKeys(dir_firstname);
		director_lastname.sendKeys(dir_lastname);
		director_emailid.sendKeys(dir_emailid);
		director_mobileno.sendKeys(dir_mobileno);
		
		Select se7 = new Select(total_number_of_employee);
		se7.selectByVisibleText(total_employee);
		other_branches.sendKeys(oth_branches);
		last_year_studentno.sendKeys(lst_year_studentno);
		}
	
	public void upload_company_profile() {
        company_profile.click();
	}
	
	public void upload_company_certificate() {
		business_certificate.click();
	}
	
	public void join_as_agency_button() {
		join_now_button.click();
	}
	
	public void confirm_create_agency() {
		confirm_join_agency.click();
	}
	
	public String already_agency_err() {
		return error_message.getText();
		
	}
}
