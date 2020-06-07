package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Bhawna\\Java Selenium links\\FireFoxDriver\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       driver.get("Http://www.google.com");
		
	}

}
