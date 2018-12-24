package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Dhaka");
		alist.add("Chittagong");
		alist.add("Sylhet");
		alist.add("Bogra");
		alist.add("Mymensingh");
		alist.add("Khulna");

		//displaying elements
		System.out.println(alist);
		//Removing "Steve" and "Angela"
		alist.remove("Sylhet");
		alist.remove("Bogra");

		//displaying elements
		System.out.println(alist);

		//Removing 3rd element
		alist.remove(2);
		System.out.println(alist);


		//displaying elements
		System.out.println("Printing ArrayList Value with for loop");

		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("Printing ArrayList Value with foreach loop");
		for (String str : alist) {
			System.out.println(str);

		}

		System.out.println("Printing ArrayList Value with Iterator loop");
		Iterator it = alist.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}
}
