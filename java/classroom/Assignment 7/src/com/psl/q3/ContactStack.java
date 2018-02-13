package com.psl.q3;

import com.psl.q2.*;

public class ContactStack {
	
	Contact stackArray[]=null;
	 int maxSize;
	 int top;
	  
	   
      	public ContactStack(int size) {
		      maxSize = size;
		      stackArray = new Contact[maxSize];   /* stack uninitialized exception*/
		      top = -1;
		   }
      	
		   public void push(Contact c) throws IncompleteDataException, InvalidEmailException, MissingContactDetailException {
			   if(stackArray==null)
			   {
				   try {
					throw new UninitializeStackException();
				} catch (UninitializeStackException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   }
			   else if(isFull())
			   {
					try {
						throw new StackFullException();
					} catch (StackFullException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
			  c.validate();
		      stackArray[++top] = c;
		   }
		   public void pop() {
			   if(stackArray==null)
			   {
				   try {
					throw new UninitializeStackException();
				} catch (UninitializeStackException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   }
			   else if(isEmpty())
			   {
					try {
						throw new StackEmptyException();
					} catch (StackEmptyException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
		      top--;
		      }
		    
		   public Contact peek() {
			      return stackArray[top];
			   }
		   public boolean isEmpty() {
		      return (top == -1);
		   }
		   public boolean isFull() {
		      return (top == maxSize - 1);
		   }

}
