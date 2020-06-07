package javaProgram;

import javax.naming.spi.DirStateFactory.Result;

public class StaticMethod {
	static int z =10;
	public static int div()
	{
		int x=20;
		int y=40;
		int result = y/x*z;
		return result;
		
	}
	public static void logout()
	
	{
		System.out.println("logout");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		div();
		int result = div();
		
		System.out.println(result);
		
		logout();
		
		
		
		
}
}
