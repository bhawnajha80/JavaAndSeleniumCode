package seleniumProject;

public class BrowserMethod extends Configuration {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	BrowserMethod.Initialsetup();
	
 driver.get("http://newtours.demoaut.com/");	
 
 String title = driver.getTitle();
 System.out.println(title);
 
if (title.contains("Tours"))
{
	System.out.println("Title is correct");
	
}

String url = driver.getCurrentUrl();
 System.out.println(url);

if(url.contains("tour"))
{
	System.out.println("url is correct");
}

 driver.navigate().to("https://www.selenium.dev/downloads/");
 
 
 
 driver.navigate().back();

	//Thread.sleep(2000);

 
 driver.navigate().refresh();
 
 driver.navigate().forward();
 
 driver.navigate().refresh();
 

	}

}
