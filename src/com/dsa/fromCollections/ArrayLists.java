package com.dsa.fromCollections;

// Arrays have continous memory and they have a fixed size, they stored their data in stacks, therefore to overcome this, ArrayList was created. 
// They have non continous memory and their size can be changed when required. AL store their data in heaps. 
// AL can store only objects whereas Arrays can store primitive data types and objects as well.
// You have to import the ArrayList class first.
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayLists {
    public static void main(String[] args) {
        // You can create ArrayLists of different datatypes, some of them are:
        // Integer | Float | String | Boolean
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> listStrings = new ArrayList<String>(); // You can also mention the datatype in the second pair of angular brackets however not necessary.
        ArrayList<Float> listFloats = new ArrayList<>();
        ArrayList<Boolean> listBoolean = new ArrayList<>();

        // Adding elements in a list:
        list.add(2);
        listStrings.add("Hello!");
        listFloats.add(1.05f);
        listBoolean.add(true);
        list.add(4); // Adding another element to the list so I can print it:

        System.out.println(list); // Output: [2, 4]

        // Adding a few more elements to make the size of the list 5:
        for(int i = 5; i<8; i++)
        {
            list.add(i);
        }

        System.out.println(list);

        // You can also add multiple items to the array at once using the Collections and addAll function.
        Collections.addAll(list, 1, 2, 3, 4, 5);

        // Getting the elements from a list:
        int elementZero = list.get(0); // The number passed as an argument to the function is the index position.
        // Above line gets you the element at index position 0.
        System.out.println(elementZero);

        // Adding an element in between the list:
        list.add(5, 8); // First number is the index position, second is the value.
        System.out.println(list);

        // Changing the element currently at position:
        list.set(0, 100); // This will make the first element 100.
        System.out.println(list);

        // Deleting an element from the index position:
        list.remove(0); // Pass in the index position.
        System.out.println(list);

        // Checking the size of the arraylist:
        System.out.println("Size of the array list is: "+list.size());

        // Iterating through a list:
        for(int i = 0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // Sorting the array list:
        // Adding a random highest element at the start of the list:
        list.add(0, 250);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
