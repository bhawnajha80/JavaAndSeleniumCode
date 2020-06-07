package javaProgram;

public class UserdefinedClass {
	
	public int Sum() {
	
	int a = 10;
	int b = 20;
	int c = 30;
	int d = a+b+c;
	return d;
	}
	
	public void login ()
	{
		String a= "Username";
		String b= "Password";
		
		System.out.println("login: " +a +" "+ b);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		UserdefinedClass obj = new UserdefinedClass ();
		
		int result = obj.Sum();
		
		System.out.println(result);
		
		int rresult = result+200;
		
		System.out.println(rresult);
		
		obj.login();
		
		
		 
		
		
	}

}
