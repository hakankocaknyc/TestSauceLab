package SauceLabs;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SauceLabTest {
	
	public static final String USERNAME = "hakankocak";
	public static final String ACCESS_KEY ="8c56211e-71b2-4f30-ad8a-055cc798e852";
	public static final String URL = "https://"+ USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	public static String bowserName = "Firefox";
	public static WebDriver driver;
	public static void main(String[] args) {
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour.IGNORE);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("name", "Google verification");
		cap.setCapability("browserName", "Firefox");
		cap.setCapability("browserVersion", "77");
		cap.setCapability("platfromName", "Windows 10");
		cap.setCapability("version", "53.0");
		
	    driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("Test is completed... ");
	}
	

}
