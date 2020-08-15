package com.pramod.ds.hashtable;

public class Main {

	public static void main(String[] args) throws Exception {
		HashTable<Integer, String> hashTable = new HashTable<Integer, String>();
		hashTable.put(1, "one");
		hashTable.put(2, "two");
		hashTable.put(3, "three");
		hashTable.put(4, "four");

		for (int i = 1; i < 5; i++) {
			System.out.println(i + " : " + hashTable.get(i));
		}
		
		hashTable.remove(3);
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i + " : " + hashTable.get(i));
		}
	}

}
