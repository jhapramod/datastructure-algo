package com.pramod.ds.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);

		list.printElement();
		
		list.remove(30);
		list.printElement();
	}

}
