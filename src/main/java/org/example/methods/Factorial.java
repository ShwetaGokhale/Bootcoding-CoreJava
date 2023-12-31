package org.example.methods;

public class  Factorial
{
    public int factorial(int i)
    {
        System.out.println("Given no = "+i);
        int fact = 1;
        for(int j = 1; j <= i; j++)
        {
            fact = fact * j;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Factorial f = new Factorial();
        int s = f.factorial(5);
        System.out.println("Factorial of given no = "+s);

    }
}