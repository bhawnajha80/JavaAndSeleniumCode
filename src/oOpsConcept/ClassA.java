package oOpsConcept;

public class ClassA {
 public  int sum()
	{
	int a =10;
	int b =20;
	int c = a+b;
	return c;
    }
 
 public static String concatination()
 {
	 String s1 = "Ribhav";
	 String s2 = "Jha";
	 String s3 = s1+s2+"Vaibhav";
	 return s3;
			 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj= new ClassA ();
		System.out.println (obj.sum());
				
		concatination();
		String s3 = concatination();
		System.out.println (s3);
		
	}

}
