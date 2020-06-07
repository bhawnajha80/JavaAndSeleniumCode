package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration {
	public static WebDriver driver ;
	public static void Initialsetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Bhawna\\Java Selenium links\\chrome driver\\chromedriver.exe");	
		
		
		driver = new ChromeDriver();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration.Initialsetup();

	}

}
