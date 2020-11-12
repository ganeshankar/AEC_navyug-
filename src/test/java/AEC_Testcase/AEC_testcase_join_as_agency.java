package AEC_Testcase;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import AEC_Base.AEC_base;
import AEC_Pages.AEC_join_as_agency;

public class AEC_testcase_join_as_agency extends AEC_base{

	AEC_join_as_agency jagency;
	
	public AEC_testcase_join_as_agency() {
		super();
	}
	
	@BeforeMethod()
	public void setup() throws InterruptedException {
		initialization();
		jagency = new AEC_join_as_agency();
		jagency.join_agency_button();
	}
	
	
	  @Test(priority =1) 
	  public void join_as_agency_mandatory() throws InterruptedException {
	  jagency.join_as_agency_mandatory_field(prop.getProperty("agencyname"),prop.getProperty("address"), prop.getProperty("country_name"),
	           prop.getProperty("state_name"), prop.getProperty("city_name"),prop.getProperty("pincode_no"), prop.getProperty("email_id"),
	           prop.getProperty("title"),prop.getProperty("dir_firstname"),prop.getProperty("dir_emailid"), prop.getProperty("dir_mobileno"));
	  jagency.join_as_agency_button();
	  jagency.confirm_create_agency();
	  
	  }
	  
	  @Test(priority =2) 
	  public void join_as_agency_allfields() throws InterruptedException, IOException {
	  jagency.join_as_agency_all_field(prop.getProperty("agencyname"),prop.getProperty("address"), prop.getProperty("country_name"),
	          prop.getProperty("state_name"), prop.getProperty("city_name"),prop.getProperty("pincode_no"), prop.getProperty("agency_website"),
	          prop.getProperty("email_id_all"), prop.getProperty("landline"),prop.getProperty("established"), prop.getProperty("inst_name"),
	          prop.getProperty("inst_country"), prop.getProperty("face_url"),prop.getProperty("insta_url"), prop.getProperty("title"),
	          prop.getProperty("dir_firstname"), prop.getProperty("dir_lastname"),prop.getProperty("dir_emailid_all"), prop.getProperty("dir_mobileno"),
	          prop.getProperty("total_employee"), prop.getProperty("oth_branches"),prop.getProperty("lst_year_studentno"));
	  Thread.sleep(5000);
	  jagency.upload_company_certificate();
	  Thread.sleep(5000);
	  Runtime.getRuntime().exec("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\data\\companycertpdf.exe"); 
	  Thread.sleep(10000); 
	  jagency.upload_company_profile(); 
	  Thread.sleep(5000);
	  Runtime.getRuntime().exec("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\data\\companyprofilepdf.exe");
	  Thread.sleep(5000);
	  jagency.join_as_agency_button();
	  jagency.confirm_create_agency();
	  }
	 
	
	
	
	@Test(priority =3)
	public void upload_profile_doc() throws InterruptedException, IOException {
		jagency.join_as_agency_mandatory_field(prop.getProperty("agencyname"), prop.getProperty("address"), prop.getProperty("country_name"), 
				prop.getProperty("state_name"), prop.getProperty("city_name"), prop.getProperty("pincode_no"), prop.getProperty("email_id_test1"), 
				prop.getProperty("title"),prop.getProperty("dir_firstname"), prop.getProperty("dir_emailid_test1"), prop.getProperty("dir_mobileno"));
	
		jagency.upload_company_certificate();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\data\\companycertdoc.exe");
		Thread.sleep(8000);
		jagency.upload_company_profile();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\data\\companyprofiledoc.exe");
		Thread.sleep(5000);
		jagency.join_as_agency_button();
		jagency.confirm_create_agency();
	
	}
	
	@Test(priority =4)
	public void upload_profile_ppt() throws InterruptedException, IOException {
		jagency.join_as_agency_mandatory_field(prop.getProperty("agencyname"), prop.getProperty("address"), prop.getProperty("country_name"), 
				prop.getProperty("state_name"), prop.getProperty("city_name"), prop.getProperty("pincode_no"), prop.getProperty("email_id_test2"), 
				prop.getProperty("title"),prop.getProperty("dir_firstname"), prop.getProperty("dir_emailid_test2"), prop.getProperty("dir_mobileno"));
		jagency.upload_company_certificate();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\data\\companycertdoc.exe");
		Thread.sleep(8000);
		jagency.upload_company_profile();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\data\\companyprofileppt.exe");
		Thread.sleep(5000);
		jagency.join_as_agency_button();
		jagency.confirm_create_agency();
	
	}
	
	@Test(priority =5)
	public void upload_profile_excel() throws InterruptedException, IOException {
		jagency.join_as_agency_mandatory_field(prop.getProperty("agencyname"), prop.getProperty("address"), prop.getProperty("country_name"), 
				prop.getProperty("state_name"), prop.getProperty("city_name"), prop.getProperty("pincode_no"), prop.getProperty("email_id_test3"), 
				prop.getProperty("title"),prop.getProperty("dir_firstname"), prop.getProperty("dir_emailid_test3"), prop.getProperty("dir_mobileno"));
		jagency.upload_company_certificate();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\data\\companycertdoc.exe");
		Thread.sleep(8000);
		jagency.upload_company_profile();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\data\\companyprofileexcel.exe");
		Thread.sleep(5000);
		jagency.join_as_agency_button();
		jagency.confirm_create_agency();
	}
	
	
	@Test(priority =6)
	public void agency_already_registered() throws InterruptedException {
		jagency.join_as_agency_mandatory_field(prop.getProperty("agencyname"), prop.getProperty("address"), prop.getProperty("country_name"), 
				prop.getProperty("state_name"), prop.getProperty("city_name"), prop.getProperty("pincode_no"), prop.getProperty("email_id"), 
				prop.getProperty("title"),prop.getProperty("dir_firstname"), prop.getProperty("dir_emailid"), prop.getProperty("dir_mobileno"));
		jagency.join_as_agency_button();
		String actual_result_error = jagency.already_agency_err();
		Assert.assertEquals(actual_result_error, prop.getProperty("expected_result_error"));
	}

}
