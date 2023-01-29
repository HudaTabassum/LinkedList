 package com.bridgelabz.linked_list;

public class LinkedList implements List{
	
	 private Node head;
	 private Node tail;
	 private int size;
	 	 
	 public LinkedList() {
		super();
		this.size = 0;
	}
	 
	 public void insertFirst (Integer data) {
		 
		 Node newNode = new Node(data);
		 newNode.next = head;
		 head = newNode;
		 
		 if (tail == null) {
			 tail = head;
		 }
		 size++;
	 }
	 
	 public void insertLast(Integer data)
	 {
		 if(tail == null)
		 {
			 insertFirst(data);
			 return; 
		 }
		 Node newNode = new Node(data);
		 tail.next = newNode;
		 tail = newNode;
		 size++;
	 }
	 
	 public void printValue() {
		 Node temp = head;
		 while (temp != null)
		 {
			 System.out.print(temp.data + "->");
			 temp =temp.next;
		 }
		 System.out.println("End");
	 }


	private class Node {
			
		 private Integer data;
		 Node next;
		 
		 public Node(Integer data) {
				super();
				this.data = data;
			}
		 
		public Node(Integer data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

	
	 }
}

	
