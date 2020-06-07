package seleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxTestDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("proceed")).click();
		
	  Alert a = driver.switchTo().alert();
	  
	  Thread.sleep(2000); 
	    
	  String str = a.getText();
	  Thread.sleep(2000); 
	  System.out.println(str);
	   
	 a.accept(); 
	  
	 Thread.sleep(2000);
	 
	 // Click on link to create account
	 WebElement link = driver.findElement(By.xpath("//*[@class='create-new-account']"));
	 
	 boolean s = link.isDisplayed();
	 System.out.println(s);
	 
	 boolean b = link.isEnabled();
	 System.out.println(b);
	 link.click();
	 
	  //driver.close();	
	 }	
	}


