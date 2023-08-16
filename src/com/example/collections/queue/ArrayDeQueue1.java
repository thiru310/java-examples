package com.example.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDeQueue1 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.add("Thiru");
		deque.add("Ravi");
		deque.add("Satish");
		deque.add("Saravana");
		
		System.out.println("Iterating deque");
		Iterator<String> itr = deque.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		deque.addFirst("Shashanth");
		System.out.println("Iterating deque ***********8");
		Iterator<String> itr1 = deque.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
