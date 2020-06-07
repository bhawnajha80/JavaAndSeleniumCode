package collectionframework;

import java.util.HashSet;

public class HashsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hst = new HashSet();
		
		hst.add(40);
		hst.add(90);
		hst.add(60);
		
		System.out.println(hst);
		hst.remove(90);
		System.out.println(hst);
		
		HashSet<String> hset= new HashSet<String>();
		   
		   hset.add("selenium");
		   
		   hset.add("Java");
		   hset.add("PHP");
		   hset.add("Ruby");
		for(String i: hset)
		{
			System.out.println(i);
		}
		
		hset.contains("Java");
		
		hset.remove("PHP");
		{
			System.out.println(hset);
		}
		
		
		hset.add("Training");
		
		{
			System.out.println(hset);
		}
		
	}

}
