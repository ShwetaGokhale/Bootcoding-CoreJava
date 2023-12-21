package org.example.loops;

public class CalculatePower
{
    public static void main(String[] args)
    {
        int a = 2;
        int power = 1;
        System.out.println("The 2 raised to the power of number " + (0) + " is " + (power));
        for( int i = 1; i<=5; i++)
        {
            power = power * a;
            System.out.println("The 2 raised to the power of number " + (i) + " is " + (power)  );
        }
    }
}
