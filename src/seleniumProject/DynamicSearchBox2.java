package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearchBox2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hostelworld.com/");
		
		driver.findElement(By.xpath("//*[@id ='location-text-input-field']")).sendKeys("London");
		
		Thread.sleep(3000);
		
		
		List<WebElement> search = driver.findElements(By.xpath("//ul[@id='predicted-search-results']/descendant::div[@class='label']"));
		
		System.out.println("Size of the List" + search.size());
		
		for (int i=0; i<search.size(); i++)
		{
			
		System.out.println(search.get(i).getText());	
		
		if (search.get(i).getText().contains("London Eye"))
		
		{
		search.get(i).click();
		
		break;
		}
			
		}
		
		
		
	}

}

