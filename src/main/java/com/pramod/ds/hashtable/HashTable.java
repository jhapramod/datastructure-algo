package com.pramod.ds.hashtable;

public class HashTable<K, V> {
	private class Entry<K, V> {
		private K key;
		private V value;
		private Entry<K, V> next;

		private Entry(K key, V value) {
			this.key = key;
			this.value = value;
			next = null;
		}
	}

	private int DEFAULT = 16;
	private Entry<K, V>[] entries;
	
	public HashTable() {
		entries = new Entry[DEFAULT];
	}

	private int getHash(K key) {
		return 10;
//		return key.hashCode() % DEFAULT;
	}

	public void put(K key, V value) {
		int hashCode = getHash(key);
		Entry<K, V> hashEntry = new Entry<K, V>(key, value);
		if (entries[hashCode] == null) {
			entries[hashCode] = hashEntry;
		} else {
			Entry<K, V> temp = entries[hashCode];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = hashEntry;
		}
	}

	public V get(K key) {
		int hashCode = getHash(key);
		Entry<K, V> hashEntry = entries[hashCode];
		if (hashEntry != null) {
			while (hashEntry != null) {
				if (hashEntry.key == key || hashEntry.key.equals(key)) {
					return (V) hashEntry.value;
				}
				hashEntry = hashEntry.next;
			}
		}
		return null;
	}
	
	public void remove(K key) throws Exception {
		int hashCode = getHash(key);
		Entry hashEntry = entries[hashCode];
		if(hashEntry == null) {
			throw new Exception(key + " not found in the HasTable");
		}
		Entry prev = null;
		while(hashEntry.next != null) {
			if (hashEntry.key == key || hashEntry.key.equals(key)) {
				break;
			}
			prev = hashEntry;
			hashEntry = hashEntry.next;
		}
		if(prev == null) {
			entries[hashCode] = hashEntry.next;
		} else {
			prev.next = hashEntry.next;
			hashEntry = null;
		}
	}

}
