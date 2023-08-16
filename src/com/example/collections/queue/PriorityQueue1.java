package com.example.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head :: "+queue.element());
		System.out.println("head :: "+queue.peek());
		
		System.out.println("Iterating the queue elements");
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Removing the elements");
		queue.remove();
		queue.poll();
		System.out.println("Printing the elements after the removal");
		Iterator<String> itr1 = queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
