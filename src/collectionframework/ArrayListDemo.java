package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static   <T> void main(String[] args) {
		// TODO Auto-generated method stub

		//Collections -> multiple of Interface and Classes
		// it is group objects
		// when we want to fetch data, delete data, sort data, storing data

		// Array List Demo

		// it is used to store dynamin data and the size of array is not fixed, it can grow

		// Creation of ArrayList

		// import ArrayList class from java.util package
		ArrayList arr1= new ArrayList ();

		// using the object arr1, we can add data into the array
		// we use method called add()
		// each data in arraylist is stored at an sequential index
		arr1.add(10);  // index 0=10
		arr1.add(200); // index 1= 200
		arr1.add(500);
		arr1.add("Selenium");
		arr1.add(2.34);
		arr1.add(true);
		arr1.add(false);

		// size() is the method used to find total values or length of the arrayList

		System.out.println(arr1.size());
		// printing the data of an array list

		System.out.println(arr1);

		//for(int i=0; i<arr1.size();i++)
		//{
		// System.out.println(arr1.get(i));
		// }


		// printing values using iterator() method


		Iterator itr =arr1.iterator();
		// hasNext() -- is used to go to array list and check if the list has next value inside it or not

		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}


		//generic and non generic

		ArrayList<String> arr2= new ArrayList<String>();

		arr2.add("selenium");

		arr2.add("Testing");

		ArrayList<Integer> arr3= new ArrayList<Integer>();

		arr3.add(2);




		}
	
	
}
