package com.oops;

import java.util.Scanner;

class Animal{
    String name;
    int limbs;
    int cost;
    // The methods inside this class can easily access its own attributes.
    public void getAnimalDetails(){
        System.out.println();
        System.out.println("My name is "+name);
        System.out.println("I have "+limbs+" limbs");
    }
    public int updateCost()
    {
        return cost*1000;
    }
    public String setName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the updated name:");
        String name = sc.nextLine();
        return name;
    }
}

public class Basics {
    public static void main(String[] args) {
        Animal myFirstAnimal = new Animal();
        myFirstAnimal.name = "Puppy";
        myFirstAnimal.limbs = 4;
        System.out.printf("In my zoo, I have one animal, its name is %s and it has %d limbs.", myFirstAnimal.name, myFirstAnimal.limbs);
        myFirstAnimal.getAnimalDetails();
        
        // Here we are trying to do something different, we are initializing the cost of the pet to 3, then later calling a method that takes the value of cost for that particular object of the class and multiplies it by 1000.
        // To do so, we do not need to pass in the cost variable to the function, since it is already an attribute of the class.
        myFirstAnimal.cost = 3;
        myFirstAnimal.cost = myFirstAnimal.updateCost();
        System.out.println(myFirstAnimal.cost);

        // Setting the name of the pet using a method defined in the class.
        myFirstAnimal.name = myFirstAnimal.setName();
        System.out.println("Name of my pet after updating it is "+myFirstAnimal.name);
    }
}
