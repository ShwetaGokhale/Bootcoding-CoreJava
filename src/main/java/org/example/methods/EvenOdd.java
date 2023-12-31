package org.example.methods;

import java.util.EventObject;

public class  EvenOdd
{
//    public int number(int i)
//    {
//        System.out.println("Given no = " +i);
//        if(i % 2 == 0)
//        {
//            System.out.println("Given number is even");
//        }
//        else
//        {
//            System.out.println("Given number is odd");
//        }
//        return i;
//    }
//    public static void main(String[] args)
//    {
//        EvenOdd e = new EvenOdd();
//        int a = e.number(6);
//    }
        public  void number(int i)
        {
            System.out.println("Given no = " +i);
            if(i % 2 == 0)
        {
            System.out.println("Given number is even");
        }
        else
        {
            System.out.println("Given number is odd");
        }
        }

    public static void main(String[] args)
    {
        EvenOdd e = new EvenOdd();
        e.number(5);

    }
}
