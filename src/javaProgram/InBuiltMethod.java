package javaProgram;

public class InBuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s ="Selenium learning is fun";
String t ="Java learning is fun";	
	System.out.println(s == t);
	int output = s.compareTo(t);
	System.out.println(output);

	String a="Java@123";
	String b= "java";
	int output1 = a.compareTo(b);

	System.out.println(output1);
	System.out.println(s.equals(t));
	
	String result = s.substring(13);
	System.out.println(result);
	
	boolean rresult = s.endsWith("fun123");
	System.out.println(rresult);
	
	System.out.println(s.length());
	System.out.println(t.length());
	
	
	
	
	
	}

}
