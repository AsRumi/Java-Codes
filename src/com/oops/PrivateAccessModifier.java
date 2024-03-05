package com.oops;

class Student{

    // Private attributes cannot be used or called using an object of this class.
    // They can only be accessed through the methods of this class.
    // Usually, since we need to set and get these attributes, the functions that do this task are called Getters and Setters.
    private int studentID;
    private String studentName;
    public void setName(String n) // A setter function.
    {
        studentName = n;
    }
    public String getName() // A getter function.
    {
        return studentName;
    }

    public void setID(int id) // A setter function.
    {
        studentID = id;
    }
    public int getID() // A getter function.
    {
        return studentID;
    }
}

public class PrivateAccessModifier {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Mutahar");
        System.out.println("Name of the student is "+s1.getName()+".");
    }
}
