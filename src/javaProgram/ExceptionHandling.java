package javaProgram;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		
		try 
		{
		int a =10/0;
		System.out.println(a);
		}
		catch(ArithmeticException x)
		{
		int a=10/2;
		System.out.println(a);
		x.printStackTrace();
		System.out.println("Printed the value of a");
		}
//		
		try
		{
		String s=null;
		System.out.println(s.length());
		}
		
		catch(NullPointerException g)
		{
			String s = "null";
			g.printStackTrace();
			System.out.println("Printed the value of s : " + s);
				
		}
		

	try
	{
	String S1= "xyz";
	
	int x = Integer.parseInt(S1);
			
	System.out.println(x);
	}
	
	catch (NumberFormatException h)
	{
		String S1="123";
		
		
		h.printStackTrace();
		int x = Integer.parseInt(S1);
		System.out.println(x);
		
		}
	
	try
	{
		int[] arr = new int [4];
		int i = arr[4];
		System.out.println("Hi, welcome to exception handling session");
	}
	catch(ArrayIndexOutOfBoundsException k)
	{
		int[] arr = new int [4];
		int i = arr[3];
		k.printStackTrace();
		System.out.println("Hi, welcome to java learning");
		System.out.println(i);
	}
	

}	
		

}
