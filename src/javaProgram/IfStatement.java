package javaProgram;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a=10;
if (a<20);
{
System.out.println("Learning If Statement");
System.out.println("A is less than 20");
}	
	
if (a>20);
{
	System.out.println("Learning If Statement");
	System.out.println(" A is greater than 20");

}
	
	int b=30;
	int c = a+b;
	System.out.println(c);
	
	if ((a<b)&&(b<c));
	
	{
		System.out.println("Compound If Statemnet is True");
		
	}
		
	
	if ((a>b)||(b<c));
	
	{
		System.out.println("Compound if statement is True");
	}
	
	if (a<20);
	{ 
		if (a==10);
		{
			if (b>a);
			{
				if (b<c);
				{
					System.out.println("Nested If Conditions executed");
				}
			}
		}
	}
	
	int d= 20+c;
	System.out.println("output of d:"  +d);
	
	if (d>c)
	{
		System.out.println("if satement is true in case of if-else statement");
		
	}
	
	else if (a==10)
	{
		System.out.println ("if a is equal to 10, so else if block is executed");
		
	}
	
	else if (b==20)
	{
		System.out.println("if b is equal to 20, so else if block is executed");
	}
	
	else
	{
		System.out.println(" if no contions are true, so else block is executed");	
	}	
	

}
}