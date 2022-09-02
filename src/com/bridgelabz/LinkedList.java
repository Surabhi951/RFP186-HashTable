package com.bridgelabz;

public class LinkedList <K,V> {

    MyNode<K, V> head;
    MyNode<K, V> tail;


    public MyNode<K,V> search(K searchData) {
        MyNode<K,V> temp = head;
        while(temp != null){
            if(temp.key.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }


    public void append(MyNode<K,V> node ) {

        if(head == null) {
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }

    public void print(){
        MyNode<K,V> temp = head;
        while(temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}

