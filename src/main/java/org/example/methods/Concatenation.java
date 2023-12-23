package org.example.methods;

public class Concatenation
{
    public String concate(String s1 , String s2)
    {
        System.out.println("String = " +s1 +"   " +s2);
        return s1 + s2;
    }
    public static void main(String[] args)
    {
        Concatenation s = new Concatenation();
        String add = s.concate("Bootcoding" , "Classes");
        System.out.println("Concate = " +add);
    }
}
