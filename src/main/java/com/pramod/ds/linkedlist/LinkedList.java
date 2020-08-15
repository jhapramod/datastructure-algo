package com.pramod.ds.linkedlist;

public class LinkedList {
	private Node head;

	static class Node {
		private int data;
		private Node next;

		private Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node cur = head;
			while(cur.next != null) {
				cur = cur.next;
			}
			
			cur.next = newNode;
		}
	}
	
	public void remove(int data) {
		Node cur = head;
		Node prev = null;
		while(cur.next != null && cur.data != data) {
//			if( cur.data == data) {
//				break;
//			}
			prev = cur;
			cur	= cur.next;
		}
		
		if(prev == null) {
			head = cur.next;
		} else {
			prev.next = cur.next;
		}
		cur = null;
	}
	
	public void printElement() {
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.data +" --> ");
			cur = cur.next;
		}
		System.out.println();
	}

}
