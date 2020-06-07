package javaProgram;

public class LoopJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		for (i=10; i>=0; i--)
			System.out.print(i + " ");

		int j = 1;
		while (j<=10)
		{
			System.out.println(j + " ");	
			j++;
			
		}
		 System.out.println("outof the while loop");	
		
		char c ='a';
		do
		{
			System.out.print(c + " ");
			c++;
			
		}
		while (c<='z');
		
		
	}

}
