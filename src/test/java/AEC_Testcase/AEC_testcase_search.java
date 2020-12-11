package AEC_Testcase;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AEC_Base.AEC_base;
import AEC_Pages.AEC_login;
import AEC_Pages.AEC_search;

public class AEC_testcase_search extends AEC_base{

	AEC_login loginpage;
	AEC_search searchpage;
	
	public AEC_testcase_search() {
		super();
	}
	
	@BeforeMethod()
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new AEC_login();
		loginpage.login(prop.getProperty("user_email_id"), prop.getProperty("user_password"));
		searchpage = new AEC_search();
		searchpage.navigatetosearch(prop.getProperty("courses_name"));
		Thread.sleep(8000);
		
		
	}
	
	  @Test(priority =1) 
	  public void intake_filter() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  searchpage.intakefilter(prop.getProperty("intake_value1"));
	 // Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value2"));
	//  Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value3"));
	//  Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value4"));
	//  Thread.sleep(8000);
	  String actual_intake_value1 = searchpage.result();
	  Assert.assertEquals(actual_intake_value1, prop.getProperty("expected_intake_value1"));
	//  Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value5"));
	//  Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value6"));
	//  Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value7"));
	//  Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value8"));
	//  Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value9"));
//	  Thread.sleep(8000);
	  String actual_intake_value2 = searchpage.result();
	  Assert.assertEquals(actual_intake_value2, prop.getProperty("expected_intake_value2"));
	//  Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value10"));
	//  Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value11"));
//	  Thread.sleep(8000);
	  searchpage.intakefilter(prop.getProperty("intake_value12")); 
	//  Thread.sleep(8000);
	  String actual_intake_value3 = searchpage.result();
	  Assert.assertEquals(actual_intake_value3, prop.getProperty("expected_intake_value3"));
	  }
	  
	  @Test(priority =2) 
	  public void delivery_method_filter() throws InterruptedException {
	  searchpage.deliverymethod(prop.getProperty("delivery_method_value1"));
	  Thread.sleep(8000);
	  searchpage.deliverymethod(prop.getProperty("delivery_method_value2"));
	  Thread.sleep(8000);
	  String actual_delivery_value1 = searchpage.result();
	  Assert.assertEquals(actual_delivery_value1, prop.getProperty("expected_delivery_value1"));
	  Thread.sleep(8000);
	  searchpage.deliverymethod(prop.getProperty("delivery_method_value3"));
	  Thread.sleep(8000);
	  searchpage.deliverymethod(prop.getProperty("delivery_method_value4"));
	  Thread.sleep(8000);
	  String actual_delivery_value2 = searchpage.result();
	  Assert.assertEquals(actual_delivery_value2, prop.getProperty("expected_delivery_value2"));
	  }
	  
	  @Test(priority =3) 
	  public void current_status_filter() throws InterruptedException {
	  searchpage.currentstatus(prop.getProperty("curent_status_value1"));
	  Thread.sleep(8000);
	  searchpage.currentstatus(prop.getProperty("curent_status_value2"));
	  Thread.sleep(8000);
	  String actual_status_value1 = searchpage.result();
	  Assert.assertEquals(actual_status_value1, prop.getProperty("expected_status_value1"));
	  Thread.sleep(8000);
	  searchpage.currentstatus(prop.getProperty("curent_status_value3"));
	  Thread.sleep(5000);
	  String actual_status_value2 = searchpage.result();
	  Assert.assertEquals(actual_status_value2, prop.getProperty("expected_status_value2"));
	  }
	  
	  @Test(priority =4) 
	  public void course_level_filter() throws InterruptedException {
	  searchpage.courselevel(prop.getProperty("course_level_value1"));
	  Thread.sleep(8000);
	  searchpage.courselevel(prop.getProperty("course_level_value2"));
	  Thread.sleep(8000);
	  searchpage.courselevel(prop.getProperty("course_level_value3"));
	  Thread.sleep(8000);
	  searchpage.courselevel(prop.getProperty("course_level_value4"));
	  Thread.sleep(8000);
	  String actual_course_value1 = searchpage.result();
	  Assert.assertEquals(actual_course_value1, prop.getProperty("expected_course_value1"));
	  Thread.sleep(8000);
	  searchpage.courselevel(prop.getProperty("course_level_value5"));
	  Thread.sleep(8000);
	  searchpage.courselevel(prop.getProperty("course_level_value6"));
	  Thread.sleep(8000);
	  searchpage.courselevel(prop.getProperty("course_level_value7"));
	  Thread.sleep(8000);
	  searchpage.courselevel(prop.getProperty("course_level_value8"));
	  Thread.sleep(8000);
	  String actual_course_value2 = searchpage.result();
	  Assert.assertEquals(actual_course_value2, prop.getProperty("expected_course_value2"));
	  
	  }
	  
	  @Test(priority =5) 
	  public void application_requirement_filter() throws InterruptedException { 
	  searchpage.applicationrequirement(prop.getProperty("application_requirement_value1")); 
	  Thread.sleep(8000);
	  searchpage.applicationrequirement(prop.getProperty("application_requirement_value2")); 
	  Thread.sleep(8000);
	  searchpage.applicationrequirement(prop.getProperty("application_requirement_value3")); 
	  Thread.sleep(8000);
	  String actual_application_value1 = searchpage.result();
	  Assert.assertEquals(actual_application_value1, prop.getProperty("expected_application_value1"));
	  Thread.sleep(8000);
	  searchpage.applicationrequirement(prop.getProperty("application_requirement_value4")); 
	  Thread.sleep(8000);
	  searchpage.applicationrequirement(prop.getProperty("application_requirement_value5")); 
	  Thread.sleep(8000);
	  searchpage.applicationrequirement(prop.getProperty("application_requirement_value6")); 
	  Thread.sleep(8000);
	  String actual_application_value2 = searchpage.result();
	  Assert.assertEquals(actual_application_value2, prop.getProperty("expected_application_value2"));
	  
	  }
	 
	
	@Test(priority =6)
	public void tution_fee_filter() throws InterruptedException {
		searchpage.tuitionfee(prop.getProperty("tuition_value"));
		Thread.sleep(5000);
		String actual_tution_value1 = searchpage.result();
		Assert.assertEquals(actual_tution_value1, prop.getProperty("expected_tution_value1"));
	}
	
	@Test(priority =7)
	public void duration_filter() throws InterruptedException {
		searchpage.duration(prop.getProperty("duration_value"));
		Thread.sleep(5000);
		String actual_duration_value1 = searchpage.result();
		Assert.assertEquals(actual_duration_value1, prop.getProperty("expected_duration_value1"));
	}
	
	@Test(priority =8)
	public void internship_period_filter() throws InterruptedException {
		searchpage.internshipperiod(prop.getProperty("internship_value"));
		Thread.sleep(5000);
		String actual_internship_value1 = searchpage.result();
		Assert.assertEquals(actual_internship_value1, prop.getProperty("expected_internship_value1"));
	}
	
	@Test(priority =9)
	public void application_fee_filter() throws InterruptedException {
		searchpage.applicationfee(prop.getProperty("application_value"));
		Thread.sleep(5000);
		String actual_application_value1 = searchpage.result();
		Assert.assertEquals(actual_application_value1, prop.getProperty("expected_application_value1"));
	}
	
	@Test(priority =10)
	public void allfilter1() throws InterruptedException {
		searchpage.intakefilter(prop.getProperty("intake_allfilter1"));
		Thread.sleep(3000);
		searchpage.intakefilter(prop.getProperty("intake_allfilter2"));
		Thread.sleep(3000);
		searchpage.intakefilter(prop.getProperty("intake_allfilter3"));
		Thread.sleep(3000);
		searchpage.intakefilter(prop.getProperty("intake_allfilter4"));
		Thread.sleep(3000);
		searchpage.intakefilter(prop.getProperty("intake_allfilter5"));
		Thread.sleep(3000);
		String actual_intake_value = searchpage.result();
		Assert.assertEquals(actual_intake_value, prop.getProperty("expected_intake_value"));
		Thread.sleep(3000);
		searchpage.deliverymethod(prop.getProperty("delivery_allfilter1"));
		Thread.sleep(3000);
		searchpage.deliverymethod(prop.getProperty("delivery_allfilter2"));
		Thread.sleep(3000);
		String actual_delivery_value = searchpage.result();
		Assert.assertEquals(actual_delivery_value, prop.getProperty("expected_delivery_value"));
		Thread.sleep(3000);
		searchpage.currentstatus(prop.getProperty("current_allfilter1"));
		Thread.sleep(3000);
		searchpage.currentstatus(prop.getProperty("current_allfilter2"));
		Thread.sleep(3000);
		String actual_current_value = searchpage.result();
		Assert.assertEquals(actual_current_value, prop.getProperty("expected_current_value"));
		Thread.sleep(3000);
		searchpage.courselevel(prop.getProperty("course_allfilter1"));
		Thread.sleep(3000);
		String actual_course_value = searchpage.result();
		Assert.assertEquals(actual_course_value, prop.getProperty("expected_course_value"));
		Thread.sleep(3000);
		searchpage.applicationrequirement(prop.getProperty("application_allfilter1"));
		Thread.sleep(3000);
		searchpage.applicationrequirement(prop.getProperty("application_allfilter2"));
		Thread.sleep(3000);
		searchpage.applicationrequirement(prop.getProperty("application_allfilter3"));
		Thread.sleep(3000);
		String actual_application_value = searchpage.result();
		Assert.assertEquals(actual_application_value, prop.getProperty("expected_application_value"));
		Thread.sleep(3000);
		searchpage.tuitionfee(prop.getProperty("tuition_allfilter1"));
		Thread.sleep(3000);
		String actual_tuition_value = searchpage.result();
		Assert.assertEquals(actual_tuition_value, prop.getProperty("expected_tuition_value"));
		Thread.sleep(3000);
		searchpage.duration(prop.getProperty("duration_allfilter1"));
		Thread.sleep(3000);
		String actual_duration_value = searchpage.result();
		Assert.assertEquals(actual_duration_value, prop.getProperty("expected_duration_value"));
		Thread.sleep(3000);
		searchpage.internshipperiod(prop.getProperty("internship_allfilter1"));
		Thread.sleep(3000);
		String actual_internship_value = searchpage.result();
		Assert.assertEquals(actual_internship_value, prop.getProperty("expected_internship_value"));
		Thread.sleep(3000);
		searchpage.applicationfee(prop.getProperty("applicationfee_allfilter1"));
		Thread.sleep(3000);
		String actual_applicationfee_value = searchpage.result();
		Assert.assertEquals(actual_applicationfee_value, prop.getProperty("expected_applicationfee_value"));
	}
	
	@Test(priority =11)
	public void allfilter2() throws InterruptedException {
		searchpage.intakefilter(prop.getProperty("intake_allfilter5"));
		Thread.sleep(3000);
		searchpage.intakefilter(prop.getProperty("intake_allfilter6"));
		Thread.sleep(3000);
		searchpage.intakefilter(prop.getProperty("intake_allfilter4"));
		Thread.sleep(3000);
		searchpage.deliverymethod(prop.getProperty("delivery_allfilter1"));
		Thread.sleep(3000);
		searchpage.currentstatus(prop.getProperty("current_allfilter2"));
		Thread.sleep(3000);
		String actual_assertion_value1_fil2 = searchpage.result();
		Assert.assertEquals(actual_assertion_value1_fil2, prop.getProperty("expected_assertion_value1_fil2"));
		Thread.sleep(3000);
		searchpage.currentstatus(prop.getProperty("current_allfilter2"));
		Thread.sleep(3000);
		searchpage.courselevel(prop.getProperty("course_allfilter3"));
		Thread.sleep(3000);
		searchpage.courselevel(prop.getProperty("course_allfilter4"));
		Thread.sleep(3000);
		searchpage.applicationrequirement(prop.getProperty("application_allfilter1"));
		Thread.sleep(3000);
		searchpage.deliverymethod(prop.getProperty("delivery_allfilter2"));
		Thread.sleep(3000);
		String actual_assertion_value2_fil2 = searchpage.result();
		Assert.assertEquals(actual_assertion_value2_fil2, prop.getProperty("expected_assertion_value2_fil2"));
		Thread.sleep(3000);
		searchpage.applicationrequirement(prop.getProperty("application_allfilter1"));
		Thread.sleep(3000);
		searchpage.tuitionfee(prop.getProperty("tuition_allfilter2"));
		Thread.sleep(3000);
		searchpage.duration(prop.getProperty("duration_allfilter2"));
		Thread.sleep(3000);
		searchpage.internshipperiod(prop.getProperty("internship_allfilter2"));
		Thread.sleep(3000);
		searchpage.applicationfee(prop.getProperty("applicationfee_allfilter2"));
		Thread.sleep(3000);
		String actul_assertion_value3_fil2 = searchpage.result();
		Assert.assertEquals(actul_assertion_value3_fil2, prop.getProperty("expected_assertion_value3_fil2"));
	}
	
	
}
