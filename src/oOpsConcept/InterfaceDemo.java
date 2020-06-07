package oOpsConcept;

public class InterfaceDemo implements TestInterface{

	
	public int sum() {
		int a1 =10;
		int b1 = 20;
		int c1 = a1+b1;
	return c1;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface rv;
		InterfaceDemo obj = new InterfaceDemo();
		obj.create();
		obj.modify();
	 rv = obj;
	 rv.create();
	 
	 // another method to create reference variable
	 
	 TestInterface rv1 = new InterfaceDemo();
	 rv1.create();
	 rv1.modify();
		
		
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Account Created");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("Account Modified");
		
	}

}
