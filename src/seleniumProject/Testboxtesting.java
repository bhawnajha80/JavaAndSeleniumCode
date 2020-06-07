package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testboxtesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page");
		
		Thread.sleep(2000);
		
		boolean b = driver.findElement(By.id("wpName2")).isDisplayed();
		System.out.println(b);
		boolean c = driver.findElement(By.id("wpName2")).isEnabled();
		System.out.println(c);
		driver.findElement(By.id("wpName2")).sendKeys("Bhawna");
		Thread.sleep(2000);
		driver.findElement(By.id("wpName2")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("wpName2")).sendKeys("OmnamahShiyay!23");
		Thread.sleep(2000);
		//driver.close();
		
		
	String TextData = 	driver.findElement(By.id("wpName2")).getAttribute("value");
	System.out.println(TextData);
	
		WebElement ele = driver.findElement(By.xpath("//*[@id='wpPassword2']"));
		
		boolean x= ele.isDisplayed();
		System.out.println(x);
		boolean y = ele.isEnabled();
		System.out.println(y);
		
		ele.sendKeys("bhawna@123");
		Thread.sleep(2000);
		
		ele.clear();
		ele.sendKeys("bhawna$$123");
		Thread.sleep(2000);
		String s = ele.getAttribute("type");
		
		System.out.println(s);
		
		WebElement e = driver.findElement(By.name("retype"));
		
		boolean p = e.isDisplayed();
		System.out.println(p);
		
		boolean q =e.isEnabled();
		System.out.println(q);
		
		e.sendKeys("bhawna$$123");
		Thread.sleep(2000);
		String str = e.getAttribute("size");
		
		System.out.println(str);
		
		WebElement email = driver.findElement(By.xpath("//*[@id='wpEmail']"));
		
		
		boolean t = email.isDisplayed();
		System.out.println(t);
		
		boolean u = email.isEnabled();
		System.out.println(u);
		
		email.sendKeys("bhawna.amarnath@yahoo.com");
		Thread.sleep(2000);
		String eml = email.getAttribute("placeholder");
		
		System.out.println(eml);
		Thread.sleep(10000);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"wpCreateaccount\"]"));
		 button.isDisplayed();
		 button.isEnabled();
		 button.click();
		 Thread.sleep(2000);
		 
		 String ButEle = button.getAttribute("value");
		 
		 System.out.println(ButEle);
		 
		 
		
	
	}

}
