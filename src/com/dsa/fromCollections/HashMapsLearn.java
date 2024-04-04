package com.dsa.fromCollections;
import java.util.HashMap;
public class HashMapsLearn {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap= new HashMap<>();
        String[] strings = {"A", "B", "C", "A"};
        for(String string:strings)
        {
            if(myMap.get(string) == null)
            {
                myMap.put(string, 1);
            }
            else
            {
                int count = myMap.get(string);
                myMap.put(string, count+1);
            }
        }
        System.out.println(myMap);
    }
}
