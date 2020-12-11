package AEC_Base;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Iterator;
	import java.util.Properties;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import AEC_Util.AEC_util;

	public class AEC_base { 

		public static WebDriver driver;
		public static Properties prop;
		static public String parentwindow;
		
		public AEC_base() {
			try {
			prop =new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\src\\main\\java\\AEC_Config\\AEC_config");
			prop.load(ip);
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		public static void initialization() {
			String browsername= prop.getProperty("browser");
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\chrome\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browsername.equals("FF"))	{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Smoke_Test_AEC\\chrome\\chromedriver.exe");
				driver = new FirefoxDriver();
				
				
					}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(AEC_util.pageload_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(AEC_util.Implicit_wait, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
		}

		public void windowhandel() {
			   Set<String> se = driver.getWindowHandles();
			   Iterator<String> it =se.iterator();
			   parentwindow = it.next();
			   String childwindow = it.next();
			   driver.switchTo().window(childwindow);	
		}
		

		public void database(String sql_query) throws ClassNotFoundException, SQLException  {
			Class.forName("org.postgresql.Driver");
			Connection con =DriverManager.getConnection("jdbc:postgresql://staging.abillionhopes.com:5432/isr_uat","navyug","navyug");
			Statement stmt =con.createStatement();
			String s ="sql_query";
			ResultSet rs =stmt.executeQuery(s);

			String account = null;
			   while(rs.next()){
			       account = rs.getString("count");

			       System.out.println("BAID: " + account);

			       }	                             
			}

		
		}

