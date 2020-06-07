package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTestDemo {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		driver.switchTo().frame("packageListFrame");
		
		Thread.sleep(2000);
		
		
		 driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		 
		// Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame("packageFrame");
		 
		 Thread.sleep(2000);
		 
		
		 driver.findElement(By.linkText("Selenium")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		  
		 driver.switchTo().frame("classFrame");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.linkText("addCustomRequestHeader")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.close();
		 

	}

}
