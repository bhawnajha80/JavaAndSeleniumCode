package oOpsConcept;

public class Overloading {
	public int sub()
	  {
	  int x= 8;
	  int y= 4;
	  int z= x-y;
	  return z;
	  }
	 
	 public String sub(String p,String q)
	 {
		 
		 String r = p+q;
		 return r;
		 
				 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
		
		System.out.println(obj.sub());
		System.out.println(obj.sub("Ribhav", "Vaibhav"));
		
	
	
	}

}
