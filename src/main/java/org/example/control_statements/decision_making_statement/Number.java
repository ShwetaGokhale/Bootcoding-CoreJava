package org.example.control_statements.decision_making_statement;//Number Properties:
//Implement a program that takes an integer as input and checks whether it's prime, even, odd.


class Number
{
	public  static  void  main(String  args[])
	{
		int n = 7;
		if(n % 2 == 0)
		{
			System.out.println("Given number is even");
		}
		else if(n % 2 == 1)
		{
			System.out.println("Given number is odd");
		}
		else
		{
			System.out.println("Given number is prime");
		}
	}
}