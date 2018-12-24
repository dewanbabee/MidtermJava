package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		/*
		 * We cannot create instance of a Queue as it is an
		 * interface, we can create instance of LinkedList or
		 * PriorityQueue and assign it to Queue
		 */
		Queue<String> q = new LinkedList<String>();

		//Adding elements to the Queue
		q.add("Science");
		q.add("Math");
		q.add("English");
		q.add("Spanish");
		q.add("Band");

		System.out.println("Elements in Queue:"+q);
		/*
		 * We can remove element from Queue using remove() method,
		 * this would remove the first element from the Queue i.e Science
		 */
		System.out.println("Removed element: "+q.remove());

		/*
		 * element() method - this returns the head of the
		 * Queue. Head is the first element of Queue
		 */
		System.out.println("Head: "+q.element());

		/*
		 * poll() method - this removes and returns the
		 * head of the Queue. Returns null if the Queue is empty
		 */
		System.out.println("poll(): "+q.poll());

		/*
		 * peek() method - returns the first element of the queue but does not remove it from the queue,
		 * however it returns null if the Queue is empty
		 */
		System.out.println("peek(): "+q.peek());

		//Again displaying the elements of Queue
		System.out.println("Elements in Queue:"+q);
		Iterator it = q.iterator();
		System.out.println("Printing Queue Elements using Itarator");
		while(it.hasNext())
			System.out.println(it.next());
	}

}
