package javaProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class User_PredefinedExceptions {

	public void driving(int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("Age should be above 18 yrs");
		}
		else
		{
			System.out.println("Age is right to get licence");
		}
	}
	
	public void waittime() throws InterruptedException 
	{
		Thread.sleep(2000);
	}
	
	public void readfile() throws FileNotFoundException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\Bhawna\\Desktop\\VJ\\FirstTest1.txt");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		User_PredefinedExceptions obj = new User_PredefinedExceptions();
		
		obj.driving(20);
		obj.waittime();
		
		try
		{
			obj.readfile();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file input");
		}
	}

}
