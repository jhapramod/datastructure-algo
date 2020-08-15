package com.pramod.ds.arraylist;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(5);
		list.add(2);
		list.add(1);
		
		System.out.println("# :" + list.size());
		
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index #" + i + " : " + list.get(i));
		}
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("P");
		list2.add("K");
		list2.add("Jha");
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println("index #" + i + " : " + list2.get(i));
		}
	}

}
