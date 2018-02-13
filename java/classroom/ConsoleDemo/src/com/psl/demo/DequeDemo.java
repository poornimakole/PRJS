package com.psl.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

import javax.swing.text.NavigationFilter;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<Integer> deque=new ArrayDeque<Integer>();
		    deque.add(2);
		    deque.add(5);
		    deque.add(3);
		    deque.add(8);
		    deque.add(1);
		    
		    
		    deque.addFirst(88);
		    
		    System.out.println(deque.peekLast());
		    Iterator<Integer> itr=deque.descendingIterator();
		    while(itr.hasNext())
		    {
		    	System.out.println(itr.next());
		    }
		    
	}

}
