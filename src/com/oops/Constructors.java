package com.oops;

class NewStudent{
    private int studentID;
    private String studentName;

    public NewStudent()
    {
        studentID = 0;
        studentName = "NAME_UNINITIALIZED";
    }

    public void setName(String n)
    {
        studentName = n;
    }
    public String getName()
    {
        return studentName;
    }

    public void setID(int id)
    {
        studentID = id;
    }
    public int getID()
    {
        return studentID;
    }
}


public class Constructors {
    public static void main(String[] args) {
        NewStudent s2 = new NewStudent();
        System.out.println(s2.getName());
        System.out.println(s2.getID());
    }
}
