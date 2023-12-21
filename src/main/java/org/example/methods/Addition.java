package org.example.methods;

public class Addition
{
    public int add(int x , int y)
    {
        int sum = x + y;
        return sum;
    }
    public static void main(String[] args)
    {
        Addition  a = new Addition();
        int r = a.add(30 , 10);
        System.out.println(r);
    }
}
