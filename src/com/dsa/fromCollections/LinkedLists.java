package com.dsa.fromCollections;

import java.util.LinkedList;
import java.util.*;

// Nodes, you have a head node, each node has a value and the address of the next node, last node carries the address of null.

public class LinkedLists {

    public static LinkedList<String> reverseList(LinkedList<String> list)
    {
        // Do not use extra memory to reverse the linked list...
        

        return list;
    }

    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is"); // Inserts this value in front of a.
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        System.out.println("Size of the linked list: "+list.size());

        for(int i = 0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // Removing the first node from the list:
        list.removeFirst();
        System.out.println(list);

        // You can also remove items from a list from a given index position:
        list.remove(2);
        System.out.println(list);

        // Reversing a linked list:
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Hello!");
        myList.add("How");
        myList.add("are");
        myList.add("you?");
        
        LinkedList<String> reversedList = reverseList(myList);
        System.out.println(reversedList);
    }
}
