package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {
        String paragraph = "To be or not to be";
        String[] splitArray = paragraph.split(" ");
        HashTable<String,Integer> hashTable = new HashTable<>();
        for (String word:splitArray) {
            if(hashTable.containsKey(word)){
                int count =  hashTable.get(word);
                hashTable.replace(word,count+1);
            }
            else{
                hashTable.put(word,1);
            }
        }
        hashTable.print();
    }
}
