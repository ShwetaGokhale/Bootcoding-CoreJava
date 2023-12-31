package org.example.methods;

public class  PowerExponentiation
{
    public int power(int i)
    {
        int b = 2;
        int power = 1;
        System.out.println("The 2 raised to the power of number " + (0) + " is " + (power));
        for(int j = 1; j <= i; j++)
        {
            power = power * b;
            System.out.println("The 2 raised to the power of number " + (j) + " is " + (power));
        }
        return power;
    }
    public static void main(String[] args)
    {
        PowerExponentiation p = new PowerExponentiation();
        int c = p.power(5);
        System.out.println("The Power is .... " +c);
    }
}
