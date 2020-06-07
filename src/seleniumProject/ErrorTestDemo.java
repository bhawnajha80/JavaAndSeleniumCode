package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorTestDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.live.com/");
		
		WebElement error = driver.findElement(By.id("idSIButton9"));
		
		boolean x = error.isDisplayed();
		System.out.println(x);
		
		boolean y = error.isEnabled();
		System.out.println(y);
		Thread.sleep(2000);
		error.click();
		
		String str = driver.findElement(By.id("usernameError")).getText();
		
		System.out.println(str);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
