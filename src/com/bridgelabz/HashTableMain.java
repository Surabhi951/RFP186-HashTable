package com.bridgelabz;
public class HashTableMain {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations" ;
        String[] splitArray = paragraph.split(" ");
        MyHashTable<String,Integer> hashTable = new MyHashTable<>();
        for (String word:splitArray) {
            Integer value = hashTable.get(word);
            if(value ==  null){
                value = 1;
            }
            else
                value = value+1;
            hashTable.add(word,value);
        }
        hashTable.print();
        System.out.println();
        System.out.println("***********************************");

        hashTable.remove("avoidable");
        hashTable.print();
    }
}

