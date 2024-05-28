package CollectionDemo;

import java.util.PriorityQueue;

import java.util.Iterator;

public class Queue1 {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();//FIFO		
		q.add("a");
		q.add("s");
		q.add("s");
		q.add("b");
		try
		{
		q.add(null);
		}
		catch(NullPointerException e) 
		{
			System.out.println("Handled NullPointerException");
		}
		
		System.out.println(q);
		
		//System.out.println(q.element()); // return head element, if queue empty then return NosuchElement
		//System.out.println(q.peek()); //return head element, if queue empty then return null
		
		//System.out.println(q.remove());//is queue empty then return NosuchElement
		//System.out.println(q);
		
		//System.out.println(q.poll());//Retries and remove element and is queue empty then return Null
		//System.out.println(q);
		
		Iterator it = q.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}	
	}
}
