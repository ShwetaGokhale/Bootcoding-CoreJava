package org.example.loops;/*Calculate  Factorial:
Create a program to calculate and print the factorial of a number entered by the user using a for loop*/


class   Factorial
{
	public   static   void  main(String   args[])
	{
		int  fact  =  1;
		for(int  a  = 1;  a  <=  5;  a++)
		{
			fact  =  fact*a;
		}
		System.out.println("Factorial   Of  Given  Number  5 =   " +fact);
	} 
}