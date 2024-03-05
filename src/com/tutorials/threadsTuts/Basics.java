package com.tutorials.threadsTuts;

// Threads are used to multitask, they use a shared memory area and is lightweight.
// There are two ways in which you can create a thread in Java.
// Extend a Thread Class.
// Implement a runnable interface.

// Difference between concurrency and parallelism.
// In concurrency you are handling multiple tasks at once, but at a time are performing action on only one task.
// In parellelism, multiple tasks are being acted upon at the same time, therefore they are happening simultaenously.
// Multithreading achieves concurrency, not parallelism.

class MyThread1 extends Thread{
    @Override
    public void run()
    {
        int i = 0;
        while(i<1000)
        {
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run()
    {
        int i = 0;
        while(i<1000)
        {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}

public class Basics {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        // When you run both the threads, you see that the CPU runs the first thread for some time then the second.
        t1.start();
        t2.start();
    }
}
