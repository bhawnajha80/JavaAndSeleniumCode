package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearchBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
   driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("insta");
		
	Thread.sleep(3000);	
	 
List<WebElement> search =  driver.findElements(By.xpath("//div[@class='aajZCb']/descendant::div[@role='option']"));
		
		System.out.println("size of the list:"  + search.size());
		
		for(int i=0; i<search.size(); i++)
			
		{
			System.out.println(search.get(i).getText());
		
			
				if(search.get(i).getText().contains("instan"))
				{
						search.get(i).click();
						break;
				}
						
		}				
	}

}
