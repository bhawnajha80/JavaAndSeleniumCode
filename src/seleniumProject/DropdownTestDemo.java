package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTestDemo {

static //	private static final Select Black = null;
 String s = "With suger";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		
		Thread.sleep(2000);
		
		WebElement e = driver.findElement(By.xpath("//*[@id='Content']/div[1]/center[1]/div/form/select"));
		
		Select drop = new Select(e);
		
		drop.selectByIndex(0);
		
		Thread.sleep(2000);
		
		drop.selectByIndex(1);
		
		List <WebElement> option  = drop.getOptions();
		
		//size() - to get the number of items present in drop down
		int optioncount = option.size();
		
		System.out.println(optioncount);
		
		for (int i =0; i < optioncount; i++)
		
		{
			System.out.println(option.get(i).getText());
			
			Thread.sleep(2000);
			
			if(option.get(i).getText().contains("With sugar"))
			{
				option.get(i).click();
			}
		
		}
		
			
 }
		
		
}


