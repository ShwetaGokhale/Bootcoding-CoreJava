package org.example.methods;

import java.util.concurrent.Callable;

public class  Concatenation
{
//    public String concate(String s1 , String s2)
//    {
//        System.out.println("String = " +s1 +"   " +s2);
//        return s1 + s2;
//    }
//    public static void main(String[] args)
//    {
//        Concatenation s = new Concatenation();
//        String add = s.concate("Bootcoding" , "Classes");
//        System.out.println("Concate = " +add);
//    }
    public void concate(String a , String b)
    {
        System.out.println("Given String = " + a +"  "+b);
        System.out.println(a + b);
    }
    public static void main(String[] args)
    {
        Concatenation c1  = new Concatenation();
        c1.concate("Bootcoding" , "Coaching");

    }
}
