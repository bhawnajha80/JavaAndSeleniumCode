package oOpsConcept;

public class Overriding extends Overloading {
 
 public int sub()
 {
	 int a = 10;
	 int b = 5;
	 int c = a-b;
	 return c;
			 
 }
  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding obj = new Overriding();
		
		System.out.println(obj.sub());
		
	}

}
