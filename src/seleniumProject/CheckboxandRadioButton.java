package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxandRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://ironspider.ca/forms/checkradio.htm");
		// Click on Check Boxes
		
		WebElement check = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));
		boolean ch = check.isDisplayed();
		System.out.println (ch);
		boolean ch1 = check.isEnabled();
		System.out.println (ch1);
		check.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[3]")).click();
		
		//Screen scrolling
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		   
	     WebElement e = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
	     
	     js.executeScript("arguments[0].scrollIntoView(true);",e);
		
		 Thread.sleep(3000);
	     
		 // Click on Radio buttons
	     
	    // WebElement Radio = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
	     
	     boolean r = e.isDisplayed();
          System.out.println(r);
         
          boolean s = e.isEnabled();
          System.out.println(s);
          
          e.click();
          
          Thread.sleep(2000);
          driver.close();
          
       
	}

}
