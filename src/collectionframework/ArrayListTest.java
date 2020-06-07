package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList  arr = new ArrayList ();
		
		
		 arr.add(20);
		 arr.add(300);
		 arr.add("Training");
		 arr.add(2.98);
		 arr.add("ArrayList");
		 
		 System.out.println(arr.size());
		 //for (int i =0; i<arr.size(); i++)
		 
		// System.out.println(arr);
			// System.out.println(arr.get(i));
		 
		 Iterator itr = arr.iterator();
		 while (itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	 arr.remove(1);
	System.out.println(arr);
	//arr.addAll();
	
	ArrayList <String> arr1 = new ArrayList<String>();
	
	arr1.add("Today");
	arr1.add("Is");
	arr1.add("Beautiful");
	arr1.add("day");
	
	for (int j =0; j < arr1.size(); j++)
	System.out.println(arr1.get(j));
	
	ArrayList <Integer> arr2 = new ArrayList<Integer>();
	arr2.add(50);
	arr2.add(60);
	
	Iterator itr1 = arr2.iterator() ;
	while(itr1.hasNext())
	
	{
		System.out.println(itr1.next());
	}
	
	
	
	
	
	
	}
	
}
