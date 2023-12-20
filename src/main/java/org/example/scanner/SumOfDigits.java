package org.example.scanner;

import java.util.Scanner;

//Sum of Digits:
//Calculate the sum of the digits of a given integer.

public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the  number  = ");
        int num = obj.nextInt();
        //123
        int sum = 0 ;
        while (num > 0)
        {
            int rem = num % 10;
            sum += rem;  //sum = sum +rem ;
            num /= 10; //num  = num /10 ;
        }
        System.out.println("Sum of given number is = "+sum);

       // System.out.println(num);

       // System.out.println("sum of give number :"+ sum);
    }
}
