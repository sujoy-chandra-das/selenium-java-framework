package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties Loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		if(driver==null) {
			 fr = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\config.properties"); //Remove the hardcoded path file
			 fr1 = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\locators.properties"); //Remove the hardcoded path file

			prop.load(fr); //load the property
			Loc.load(fr1); //load the property

			
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
	        WebDriverManager.firefoxdriver().setup(); //base
	        driver = new FirefoxDriver(); //base
	        driver.get(prop.getProperty("testurl")); //properties
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	        driver.get(prop.getProperty("testurl")); //properties			
			}
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Teardown successfull");
		
	}

}
