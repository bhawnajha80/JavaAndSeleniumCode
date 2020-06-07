package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =  new ChromeDriver();
		
		
		driver.get("https://www.google.com/gmail/about/#");
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
WebElement input = driver.findElement(By.xpath("//*[@name = 'identifier'])"));
input.sendKeys("bhawna.amarnath@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='RveJvd snByac')")).click();
		

	}

}
