package org.example.methods;

public class  Multiplication
{
    public int multiply(int a , int b)
    {
        int c = a * b;
        System.out.println("Given  Numbers = " +a+"  "+b);
        return c;
    }
    public static void main(String[] args)
    {
        Multiplication m = new Multiplication();
        int  value = m.multiply(3 , 2);
        System.out.println("Multiplication = " +value);

    }
}
