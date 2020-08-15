package com.pramod.ds.arraylist;

import java.util.Arrays;

public class ArrayList<T> {
	private int size;
	private int DEFAULT_SIZE = 1;
	private Object[] elements;
	
	public ArrayList() {
		elements = new Object[DEFAULT_SIZE];
	}
	
	public void add(T item) {
		if(size == elements.length) {
			ensureCapacity();
		}
		
		elements[size++] = item;
	}

	private void ensureCapacity() {
		int newSize = 2 * DEFAULT_SIZE;
		elements = Arrays.copyOf(elements, newSize);
		DEFAULT_SIZE = newSize;
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int index) {
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		
		return elements[index];
	}
	
	public void remove(int index) {
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		
//		elements[index] = 0;
//		while(index < size-1) {
//			elements[index] = elements[index+1];
//			index++;
//		}
//		elements[size - 1] = 0;
		
		int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elements, index+1, elements, index,
                             numMoved);
        elements[--size] = 0;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
