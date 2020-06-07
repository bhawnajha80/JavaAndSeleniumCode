package seleniumProject;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setupcheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		//Use the browser driver to open browser on my machine
		//These lines are mandatory for all script
		
		
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Bhawna\\Java Selenium links\\chrome driver\\chromedriver.exe");	
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//driver.get("https://en.wikipedia.org/");
	driver.get("https://www.google.com");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	if (title.equals("Google"));
	{
		System.out.println("Title is correct");
	}
	//driver.findElement(By.id("searchInput"));
	
	//driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
	//driver.findElement(By.xpath("//*[@id='wpName2']"));
	
	 driver.navigate().to("https://www.selenium.dev/downloads/");
	 
	 
	 
	 driver.navigate().back();

		Thread.sleep(2000);

	 
	 driver.navigate().refresh();
	 
	 driver.navigate().forward();
	 Thread.sleep(2000);
	 driver.navigate().refresh();
	 Thread.sleep(2000);
  driver.close();
	
	}

}
