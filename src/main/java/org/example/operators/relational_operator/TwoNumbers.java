package org.example.operators.relational_operator;// Create a Java program that compares two numbers and prints whether the first number is greater than, less than, or equal to the second number.

public class TwoNumbers
{
	public static void main(String args[])
	{
		int  a  =  2;
		int  b  =  4;
		System.out.println(a);
		System.out.println(b);
		if(a > b)
		{
			System.out.println("First  number is greater than second number");
		}
		else
		{
			System.out.println("First  number is not greater than second number");
		}
		if(a < b)
		{
			System.out.println("First  number is less than second number");
		}
		else
		{
			System.out.println("First  number is not less than second number");
		}
		if(a == b)
		{
			System.out.println("First  number is equal to second number");
		}
		else
		{
			System.out.println("First  number is not equal  to  second number");
		}
	}
}