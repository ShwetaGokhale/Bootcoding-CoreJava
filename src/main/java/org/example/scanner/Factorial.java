package org.example.scanner;

import java.util.Scanner;

//Factorial Calculator:
//Create a program that calculates the factorial of a given number. Validate input to ensure it's a non-negative integer.


public class Factorial
{
    public static void main(String[] args)
    {
        int fact = 1;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the no = ");
        int num = a.nextInt();
        for(int j = 1; j <= num; j++)
        {
            fact = fact * j;
        }
        System.out.println("Factorial of no = "+ fact);
    }
}
