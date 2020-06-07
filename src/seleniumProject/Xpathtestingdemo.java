package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtestingdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://money.rediff.com/index.html");
	
	String axes = driver.findElement(By.xpath(" //div[@class='hmbseindicestable show']/descendant::a[1]")).getText();
  
  System.out.println(axes);
  
  JavascriptExecutor js=((JavascriptExecutor)driver);
  
  WebElement e = driver.findElement(By.xpath ("//*[@id=\"div_bseindices\"]/div/div/div/ul[2]/li[1]/a"));
  
  js.executeScript("arguments[0].scrollIntoView(true);",e);
	
	 Thread.sleep(3000);
  //Thread.sleep(2000);
    e.click();
    
  System.out.println(driver.getTitle());
 // driver.navigate().back();
  
  
  WebElement b = driver.findElement(By.linkText("My Portfolio"));

  b.click();
  Thread.sleep(2000);
  WebElement user = driver.findElement(By.xpath("//input[@name='email-id']"));
  boolean t =user.isDisplayed();
  System.out.println(t);
  
  boolean s = user.isEnabled();
  System.out.println(s);
  
  user.sendKeys("bhawna.amarnath@gmail.com");
  Thread.sleep(2000);
  WebElement Pass = driver.findElement(By.id("userpass"));
  boolean st =Pass.isDisplayed();
  System.out.println(st);
  
  boolean sp = Pass.isEnabled();
  System.out.println(sp);
  
  Pass.sendKeys("bhawna@123");
  Thread.sleep(2000);
  
  WebElement button = driver.findElement(By.id("loginsubmit"));
  
  boolean d =button.isDisplayed();
  System.out.println(d);
  
  boolean f = button.isEnabled();
  System.out.println(f);
 // System.out.println(b.getText());
  
  button.click();

 // driver.close();
	
}
	
}