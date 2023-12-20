package org.example.control_statements.looping_statement.while_loop;//Multiplication Table:
//Create a program that prints the multiplication table of a given number using a while loop. Print the first 10 multiples.


class   MultiplicationTable
{
	public   static   void   main(String args[])
	{
		int b = 1;
		System.out.println("Multiplication Table = ");
		while(b <= 10)
		{
			System.out.println(b*7);
			b++;
		}
	} 
}