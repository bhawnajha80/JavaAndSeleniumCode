package javaProgram;

public class StringJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1 = "SELENIUM";
 String s2 = "Training";
 
 System.out.println(s1+" "+s2);
 System.out.println(s1==s2);
 
 System.out.println(s1.toLowerCase());
 System.out.println(s2.toUpperCase());
 
 
 String s3="SELENIUM";
	String s4 = "selenium";
	
	System.out.println(s3.equalsIgnoreCase(s4));
	
	
	String str = "abc";
	String cde = "cde";
	System.out.println(str + cde);
	
	String c = "abc".substring(2,3);
	String d = cde.substring(1,2);
	
	System.out.println (c);
	System.out.println (d);
	
	String ss = "Vaibhav";
			
	System.out.println(ss.replace("Vaibhav", "Ribhav"));
	
String  str1= "bhawnajha@gmail.com";
	String str2= "boo:and:foo";
	
	//String[] arrOfStr = str1.split("@", 5);
	//String[] arrOfStr = str2.split(":", 5);
	String[] arrOfStr = str2.split("o", 0);
	
	for( String a: arrOfStr)
	
		System.out.println(a);
	
	String st = "Vaibhav@gmail.com";
	
	System.out.println(st.replaceAll("@", "@hotmail.com"));
	
			}

}
