package com.bridgelabz.linked_list;

public class LinkedListMain  {
	public static void main(String[] args) {
		
		
	
	LinkedList number = new LinkedList();
	  number.insertLast(56);
	  number.insertLast(30);
	  number.insertLast(70);
	  number.insert(60, 2);
	  System.out.println(number.deleteFirst());
	  
	//  System.out.println(number);
	  number.printValue();
	}
}
