package com.bridgelabz;

import java.util.ArrayList;

public class HashTable <K,V> {

    Integer bucketSize;
    ArrayList<LinkedList<K, V>> bucketList;

    public HashTable() {
        this.bucketSize = 10;
        this.bucketList = new ArrayList<>(bucketSize);
        for (int i = 0; i < bucketSize; i++) {
            bucketList.add(null);
        }
    }

    public Integer getIndex(K key) {
        Integer index = Math.abs(key.hashCode()) % bucketSize;
        return index;
    }


    public V get(K key) {
        int index = getIndex(key);
        LinkedList<K, V> linkedList = bucketList.get(index);
        if (linkedList == null) {
            return null;
        }
        MyNode<K, V> myNode = linkedList.search(key);
        return (myNode == null) ? null : myNode.value;
    }

    public void add(K key, V value) {
        int index = getIndex(key);
        LinkedList<K, V> linkedList = bucketList.get(index);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            bucketList.set(index, linkedList);
        }
        MyNode<K, V> myNode = linkedList.search(key);
        if (myNode == null) {
            myNode = new MyNode<>(key, value);
            linkedList.append(myNode);
        } else {
            myNode.value = value;
        }
    }

    void print() {
        int i = 1;
        for (LinkedList<K, V> linkedList : bucketList) {
            if (linkedList == null) {
                continue;
            }
            System.out.println("Linked list " + i);
            linkedList.print();
            i++;
        }


    }
}