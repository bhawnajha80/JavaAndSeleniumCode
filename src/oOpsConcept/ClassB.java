package oOpsConcept;

import javaProgram.UserdefinedClass;

public class ClassB extends ClassA {
	public int mul()
	{
		int a = 20;
		int b = 20;
		int c = a*b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB obj = new ClassB();
		System.out.println(obj.mul());
		System.out.println(obj.sum());
		
		concatination ();
		String s3 = concatination();
		System.out.println (s3);
		
		
		
	}

}
