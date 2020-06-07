package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Getting the web page
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		//Click on Create account link
		
		WebElement link = driver.findElement(By.xpath("//*[@id='pt-createaccount']/a"));
		
		boolean a = link.isDisplayed();
		System.out.println(a);
		boolean b = link.isEnabled();
		System.out.println(b);
		
		link.click();

		//Creating an account and entering User name data
		WebElement UName =driver.findElement(By.id("wpName2"));
		
		boolean c =UName.isDisplayed();
		System.out.println(c);
		boolean d = UName.isEnabled();
		System.out.println(d);
		
		UName.sendKeys("Shivashaktishiva1!345");
		
		String str = UName.getAttribute("value");
		System.out.println(str);
		
		//Entering Password
		WebElement UPwd = driver.findElement(By.xpath("//*[@id='wpPassword2']"));
		
		
		boolean e = UPwd.isDisplayed();
		System.out.println(e);
		boolean f = UPwd.isEnabled();
		System.out.println(f);
		
		UPwd.sendKeys("bhawna$$123");
		
		String str1 = UPwd.getAttribute("Placeholder");
		
		System.out.println(str1);
		
		// Confirm Password 
		
      WebElement ConPwd = driver.findElement(By.name("retype"));
		
		boolean g = ConPwd.isDisplayed();
		System.out.println(g);
		
		boolean h =ConPwd.isEnabled();
		System.out.println(h);
		
		ConPwd.sendKeys("bhawna$$123");
		Thread.sleep(2000);
		String str2 = ConPwd.getAttribute("size");
		
		System.out.println(str2);
		
		//Enter Email id
		WebElement email = driver.findElement(By.xpath("//*[@id='wpEmail']"));
		
		
		boolean i = email.isDisplayed();
		System.out.println(i);
		
		boolean j = email.isEnabled();
		System.out.println(j);
		
		email.sendKeys("bhawna.amarnath@yahoo.com");
		
		Thread.sleep(2000);
		
		String eml = email.getAttribute("placeholder");
				
		System.out.println(eml);
		
		Thread.sleep(10000);
		
		 WebElement button = driver.findElement(By.xpath("//*[@id=\"wpCreateaccount\"]"));
		 boolean k = button.isDisplayed();
		 System.out.println(k);
		 
		 boolean l = button.isEnabled();
		 System.out.println(l);
		 
		 button.click();
		 
		 Thread.sleep(2000);
		 
		 String ButEle = button.getAttribute("value");
		 
		 System.out.println(ButEle);
		 
		 // Clicking on Links
		 
		 WebElement link1 = driver.findElement(By.linkText("Contents"));
		 
		 boolean m = link1.isDisplayed();
		 System.out.println(m);
		 boolean n = link1.isEnabled();
		 System.out.println(n);
		 
		 link1.click();
		 
         WebElement link2 = driver.findElement(By.partialLinkText("donate to"));
		 
		 boolean o = link2.isDisplayed();
		 System.out.println(o);
		 boolean p = link2.isEnabled();
		 System.out.println(p);
		 
		 link2.click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 Thread.sleep(2000);
		  driver.close();		
		
		
		

	}

}
