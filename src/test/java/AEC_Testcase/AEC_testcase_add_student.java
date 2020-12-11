package AEC_Testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AEC_Base.AEC_base;
import AEC_Pages.AEC_add_student;
import AEC_Pages.AEC_login;

public class AEC_testcase_add_student extends AEC_base{

AEC_login loginpage;
AEC_add_student stu;

	
	public AEC_testcase_add_student() {
		super();
	}
	
	@BeforeTest()
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new AEC_login();
		loginpage.login(prop.getProperty("user_email_id"), prop.getProperty("user_password"));
		Thread.sleep(3000);
		stu = new AEC_add_student();
		stu.student();
		Thread.sleep(5000);
		stu.addstudent();
	}
	
	@Test(priority =1)
	public void genaral_information_page() throws InterruptedException {
		stu.generalinformationpage(prop.getProperty("emailid"), prop.getProperty("stud_title"), prop.getProperty("stud_firstname"),
				prop.getProperty("stud_lastname"), prop.getProperty("stud_gender"),prop.getProperty("stud_dob"), prop.getProperty("stud_nationality"), 
				prop.getProperty("stud_mobile"), prop.getProperty("stud_alt_no"), prop.getProperty("stud_passport"), prop.getProperty("stud_country"), 
				prop.getProperty("stud_state"), prop.getProperty("stud_city"), prop.getProperty("stud_houseno"), prop.getProperty("stud_pincode"));
		stu.submitbutton();
		Thread.sleep(5000);
	}
	
	@Test(priority =2)
	public void education_history_page() throws InterruptedException {
		 
		String current_quali = prop.getProperty("current_qual");
		stu.educationhistorypage(prop.getProperty("current_qual"));
		Thread.sleep(5000);
		switch(current_quali) {
		
        case  "High School (Class 10)":
			
    		stu.class_education_select(prop.getProperty("tenclass1"), prop.getProperty("edu_data1"));
			stu.class_education_select(prop.getProperty("tenclass2"), prop.getProperty("edu_data2"));
			stu.class_education_select(prop.getProperty("tenclass3"), prop.getProperty("edu_data3"));
			stu.class_education_value(prop.getProperty("tenclass1"), prop.getProperty("edu_value1"));
			stu.class_education_value(prop.getProperty("tenclass2"), prop.getProperty("edu_value2"));
			stu.class_education_value(prop.getProperty("tenclass3"), prop.getProperty("edu_value3"));
	
			break;
		
		case "Senior Secondary School (Class 12)":
			
			stu.class_education_select(prop.getProperty("twelveclassselect1"), prop.getProperty("twelve_data1"));
			stu.class_education_select(prop.getProperty("twelveclassselect2"), prop.getProperty("twelve_data2"));
			stu.class_education_select(prop.getProperty("twelveclassselect3"), prop.getProperty("twelve_data3"));
			stu.class_education_value(prop.getProperty("twelveclassvalue1"), prop.getProperty("twelve_value1"));
			stu.class_education_value(prop.getProperty("twelveclassvalue2"), prop.getProperty("twelve_value2"));
			stu.class_education_value(prop.getProperty("twelveclassvalue3"), prop.getProperty("twelve_value3"));
			stu.class_education_value(prop.getProperty("twelveclassvalue4"), prop.getProperty("twelve_value4"));
			stu.class_education_value(prop.getProperty("twelveclassvalue5"), prop.getProperty("twelve_value5"));
			stu.class_education_value(prop.getProperty("twelveclassvalue6"), prop.getProperty("twelve_value6"));
			stu.class_education_value(prop.getProperty("twelveclassvalue7"), prop.getProperty("twelve_value7"));
			stu.class_education_select(prop.getProperty("twelveclassselect4"), prop.getProperty("twelve_data4"));
			stu.class_education_select(prop.getProperty("twelveclassselect5"), prop.getProperty("twelve_data5"));
			stu.class_education_select(prop.getProperty("twelveclassselect6"), prop.getProperty("twelve_data6"));	
			stu.class_education_value(prop.getProperty("twelveclassvalue8"), prop.getProperty("twelve_value8"));
			stu.class_education_value(prop.getProperty("twelveclassvalue9"), prop.getProperty("twelve_value9"));
			stu.class_education_value(prop.getProperty("twelveclassvalue10"), prop.getProperty("twelve_value10"));
			
			break;
			
       case "Graduate (Bachelors)":
			
			stu.class_education_select(prop.getProperty("gradclassselect1"), prop.getProperty("grad_data1"));
			stu.class_education_select(prop.getProperty("gradclassselect2"), prop.getProperty("grad_data2"));
			stu.class_education_value(prop.getProperty("gradclassvalue1"), prop.getProperty("grad_value1"));
			stu.class_education_value(prop.getProperty("gradclassvalue2"), prop.getProperty("grad_value2"));
			stu.class_education_value(prop.getProperty("gradclassvalue3"), prop.getProperty("grad_value3"));
			stu.class_education_value(prop.getProperty("gradclassvalue4"), prop.getProperty("grad_value4"));
			stu.class_education_value(prop.getProperty("gradclassvalue5"), prop.getProperty("grad_value5"));
			stu.class_education_select(prop.getProperty("gradclassselect3"), prop.getProperty("grad_data3"));
			stu.class_education_select(prop.getProperty("gradclassselect4"), prop.getProperty("grad_data4"));
			stu.class_education_value(prop.getProperty("gradclassvalue6"), prop.getProperty("grad_value6"));
			stu.class_education_select(prop.getProperty("gradclassselect5"), prop.getProperty("grad_data5"));
			stu.class_education_select(prop.getProperty("gradclassselect6"), prop.getProperty("grad_data6"));
			stu.class_education_select(prop.getProperty("gradclassselect7"), prop.getProperty("grad_data7"));
			stu.class_education_value(prop.getProperty("gradclassvalue7"), prop.getProperty("grad_value7"));
			stu.class_education_value(prop.getProperty("gradclassvalue8"), prop.getProperty("grad_value8"));
			stu.class_education_value(prop.getProperty("gradclassvalue9"), prop.getProperty("grad_value9"));
			stu.class_education_value(prop.getProperty("gradclassvalue10"), prop.getProperty("grad_value10"));
			stu.class_education_value(prop.getProperty("gradclassvalue11"), prop.getProperty("grad_value11"));
			stu.class_education_value(prop.getProperty("gradclassvalue12"), prop.getProperty("grad_value12"));
			stu.class_education_value(prop.getProperty("gradclassvalue13"), prop.getProperty("grad_value13"));
			stu.class_education_select(prop.getProperty("gradclassselect8"), prop.getProperty("grad_data8"));
			stu.class_education_select(prop.getProperty("gradclassselect9"), prop.getProperty("grad_data9"));
			stu.class_education_select(prop.getProperty("gradclassselect10"), prop.getProperty("grad_data10"));
			stu.class_education_value(prop.getProperty("gradclassvalue14"), prop.getProperty("grad_value14"));
			stu.class_education_value(prop.getProperty("gradclassvalue15"), prop.getProperty("grad_value15"));
			stu.class_education_value(prop.getProperty("gradclassvalue16"), prop.getProperty("grad_value16"));
			
			break;
			
       case "Post Graduate (Masters)":
    	   stu.class_education_select(prop.getProperty("pgradclassselect1"), prop.getProperty("pgrad_data1"));
			stu.class_education_select(prop.getProperty("pgradclassselect2"), prop.getProperty("pgrad_data2"));
			stu.class_education_value(prop.getProperty("pgradclassvalue1"), prop.getProperty("pgrad_value1"));
			stu.class_education_value(prop.getProperty("pgradclassvalue2"), prop.getProperty("pgrad_value2"));
			stu.class_education_value(prop.getProperty("pgradclassvalue3"), prop.getProperty("pgrad_value3"));
			stu.class_education_value(prop.getProperty("pgradclassvalue4"), prop.getProperty("pgrad_value4"));
			stu.class_education_value(prop.getProperty("pgradclassvalue5"), prop.getProperty("pgrad_value5"));
			stu.class_education_select(prop.getProperty("pgradclassselect3"), prop.getProperty("pgrad_data3"));
			stu.class_education_value(prop.getProperty("pgradclassvalue6"), prop.getProperty("pgrad_value6"));
			stu.class_education_select(prop.getProperty("pgradclassselect4"), prop.getProperty("pgrad_data4"));
			stu.class_education_select(prop.getProperty("pgradclassselect5"), prop.getProperty("pgrad_data5"));
			stu.class_education_value(prop.getProperty("pgradclassvalue7"), prop.getProperty("pgrad_value7"));
			stu.class_education_value(prop.getProperty("pgradclassvalue8"), prop.getProperty("pgrad_value8"));
			stu.class_education_value(prop.getProperty("pgradclassvalue9"), prop.getProperty("pgrad_value9"));
			stu.class_education_value(prop.getProperty("pgradclassvalue10"), prop.getProperty("pgrad_value10"));
			stu.class_education_value(prop.getProperty("pgradclassvalue11"), prop.getProperty("pgrad_value11"));
			stu.class_education_select(prop.getProperty("pgradclassselect6"), prop.getProperty("pgrad_data6"));
			stu.class_education_select(prop.getProperty("pgradclassselect7"), prop.getProperty("pgrad_data7"));
			stu.class_education_value(prop.getProperty("pgradclassvalue12"), prop.getProperty("pgrad_value12"));
			stu.class_education_select(prop.getProperty("pgradclassselect8"), prop.getProperty("pgrad_data8"));
			stu.class_education_select(prop.getProperty("pgradclassselect9"), prop.getProperty("pgrad_data9"));
			stu.class_education_select(prop.getProperty("pgradclassselect10"), prop.getProperty("pgrad_data10"));
			stu.class_education_value(prop.getProperty("pgradclassvalue13"), prop.getProperty("pgrad_value13"));
			stu.class_education_value(prop.getProperty("pgradclassvalue14"), prop.getProperty("pgrad_value14"));
			stu.class_education_value(prop.getProperty("pgradclassvalue15"), prop.getProperty("pgrad_value15"));
			stu.class_education_value(prop.getProperty("pgradclassvalue16"), prop.getProperty("pgrad_value16"));
			stu.class_education_value(prop.getProperty("pgradclassvalue17"), prop.getProperty("pgrad_value17"));
			stu.class_education_value(prop.getProperty("pgradclassvalue18"), prop.getProperty("pgrad_value18"));
			stu.class_education_value(prop.getProperty("pgradclassvalue19"), prop.getProperty("pgrad_value19"));
			stu.class_education_select(prop.getProperty("pgradclassselect11"), prop.getProperty("pgrad_data11"));
			stu.class_education_select(prop.getProperty("pgradclassselect12"), prop.getProperty("pgrad_data12"));
			stu.class_education_select(prop.getProperty("pgradclassselect13"), prop.getProperty("pgrad_data13"));
			stu.class_education_value(prop.getProperty("pgradclassvalue20"), prop.getProperty("pgrad_value20"));
			stu.class_education_value(prop.getProperty("pgradclassvalue21"), prop.getProperty("pgrad_value21"));
			stu.class_education_value(prop.getProperty("pgradclassvalue22"), prop.getProperty("pgrad_value22"));
			break;
			
       case "Doctorate (PhD)":
    	   stu.class_education_select(prop.getProperty("phdclassselect1"), prop.getProperty("phd_data1"));
			stu.class_education_select(prop.getProperty("phdclassselect2"), prop.getProperty("phd_data2"));
			stu.class_education_value(prop.getProperty("phdclassvalue1"), prop.getProperty("phd_value1"));
			stu.class_education_value(prop.getProperty("phdclassvalue2"), prop.getProperty("phd_value2"));
			stu.class_education_value(prop.getProperty("phdclassvalue3"), prop.getProperty("phd_value3"));
			stu.class_education_value(prop.getProperty("phdclassvalue4"), prop.getProperty("phd_value4"));
			stu.class_education_value(prop.getProperty("phdclassvalue5"), prop.getProperty("phd_value5"));
			stu.class_education_select(prop.getProperty("phdclassselect3"), prop.getProperty("phd_data3"));
			stu.class_education_value(prop.getProperty("phdclassvalue6"), prop.getProperty("phd_value6"));
			stu.class_education_select(prop.getProperty("phdclassselect4"), prop.getProperty("phd_data4"));
			stu.class_education_select(prop.getProperty("phdclassselect5"), prop.getProperty("phd_data5"));
			stu.class_education_value(prop.getProperty("phdclassvalue7"), prop.getProperty("phd_value7"));
			stu.class_education_value(prop.getProperty("phdclassvalue8"), prop.getProperty("phd_value8"));
			stu.class_education_value(prop.getProperty("phdclassvalue9"), prop.getProperty("phd_value9"));
			stu.class_education_value(prop.getProperty("phdclassvalue10"), prop.getProperty("phd_value10"));
			stu.class_education_value(prop.getProperty("phdclassvalue11"), prop.getProperty("phd_value11"));
			stu.class_education_select(prop.getProperty("phdclassselect6"), prop.getProperty("phd_data6"));
			stu.class_education_select(prop.getProperty("phdclassselect7"), prop.getProperty("phd_data7"));
			stu.class_education_value(prop.getProperty("phdclassvalue12"), prop.getProperty("phd_value12"));
			stu.class_education_select(prop.getProperty("phdclassselect8"), prop.getProperty("phd_data8"));
			stu.class_education_select(prop.getProperty("phdclassselect9"), prop.getProperty("phd_data9"));
			stu.class_education_select(prop.getProperty("phdclassselect10"), prop.getProperty("phd_data10"));
			stu.class_education_value(prop.getProperty("phdclassvalue13"), prop.getProperty("phd_value13"));
			stu.class_education_value(prop.getProperty("phdclassvalue14"), prop.getProperty("phd_value14"));
			stu.class_education_value(prop.getProperty("phdclassvalue15"), prop.getProperty("phd_value15"));
			stu.class_education_value(prop.getProperty("phdclassvalue16"), prop.getProperty("phd_value16"));
			stu.class_education_value(prop.getProperty("phdclassvalue17"), prop.getProperty("phd_value17"));
			stu.class_education_value(prop.getProperty("phdclassvalue18"), prop.getProperty("phd_value18"));
			stu.class_education_value(prop.getProperty("phdclassvalue19"), prop.getProperty("phd_value19"));
			stu.class_education_select(prop.getProperty("phdclassselect11"), prop.getProperty("phd_data11"));
			stu.class_education_select(prop.getProperty("phdclassselect12"), prop.getProperty("phd_data12"));
			stu.class_education_select(prop.getProperty("phdclassselect13"), prop.getProperty("phd_data13"));
			stu.class_education_value(prop.getProperty("phdclassvalue20"), prop.getProperty("pd_value20"));
			stu.class_education_value(prop.getProperty("phdclassvalue21"), prop.getProperty("phd_value21"));
			stu.class_education_value(prop.getProperty("phdclassvalue22"), prop.getProperty("phd_value22"));
			stu.class_education_value(prop.getProperty("phdclassvalue23"), prop.getProperty("phd_value23"));
			stu.class_education_value(prop.getProperty("phdclassvalue24"), prop.getProperty("phd_value24"));
			stu.class_education_value(prop.getProperty("phdclassvalue25"), prop.getProperty("phd_value25"));
			stu.class_education_value(prop.getProperty("phdclassvalue26"), prop.getProperty("phd_value26"));
			break;
				
			default: 
				System.out.println("no clas found");
				break;
			
		}

	}
	
	@Test(priority =3)
	public void test_score_page() {
		
	}
	



}


