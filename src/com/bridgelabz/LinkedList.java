package com.bridgelabz;

public class LinkedList <K,V> {
    MyNode<K,V> head;
    MyNode<K,V> tail;

    public void add(K key,V value) {
        MyNode<K,V> newNode = new MyNode<K,V>(key,value);
        if(head == null) {
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void replace(K key, V value) {
        MyNode<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
            }
            temp = temp.next;
        }
    }

    public boolean containsKey(String key){
        MyNode<K,V> temp = head;
        while(temp != null){
            if(temp.key.equals(key)){
                return true;
            }
            temp = temp.next;
        }
        return false;

    }

    public int get(String word){
        MyNode<K,V> temp = head;
        int count = 0;
        while(temp != null){
            if(temp.key.equals(word)){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }


    public void print() {
        MyNode<K,V> temp = head;
        while(temp != null){
            System.out.print("{ " + temp.key + "=" + temp.value + " }" + "\n");
            temp = temp.next;
        }
    }
}
