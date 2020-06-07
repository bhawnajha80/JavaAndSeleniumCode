package seleniumProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowTestDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		Thread.sleep(2000);
		
		WebElement Pop = driver.findElement(By.linkText("Good PopUp #1"));
	
		Pop.click();
		
		
		Set <String> handles = driver.getWindowHandles();
		
		
		Iterator <String> it = handles.iterator();
		String Parentwindowid = it.next();
		
		System.out.println(Parentwindowid);
		
		String childwindowid = it.next();
		System.out.println(childwindowid);
		
		
		driver.switchTo().window(childwindowid);
		
	//	driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		System.out.println("Title of the page" + Title);
		
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(Parentwindowid);
		String Title1 = driver.getTitle();
		System.out.println("Title of the page" + Title1);
		
		Thread.sleep(2000);
		
		WebElement Pop1 = driver.findElement(By.linkText("Good PopUp #4"));
		
		Pop1.click();
        Set <String> handles1 = driver.getWindowHandles();
		
		
		Iterator <String> it1 = handles1.iterator();
		String Parentwindowid1 = it1.next();
		
		System.out.println(Parentwindowid);
		
		String childwindowid2 = it1.next();
		System.out.println(childwindowid2);
		
		
		driver.switchTo().window(childwindowid2);
		/*String Childwindowid2 = it.next();
		System.out.println(Childwindowid2);*/
		
		//driver.switchTo().window(Childwindowid2);
		Thread.sleep(2000);
		
		String Title3 = driver.getTitle();
		System.out.println("Title of the page"  +  Title3);
		
		 Thread.sleep(2000);
		
		 driver.close();
		
     
		
		driver.switchTo().window(Parentwindowid1);
		String Title2 = driver.getTitle();
		System.out.println("Title of the page"  +  Title2);
		
	    driver.close();
		
	}
	
	
}
		
		