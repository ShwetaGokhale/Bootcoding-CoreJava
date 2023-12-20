package org.example.control_statements.jumping_statement;//Program to print number from 1 to 10.


class ContinueStatement
{
	public static void main(String args[])
	{
		for(int p = 1; p <= 10; p++)
		{
			if(p == 5)
			{
				continue;
			}
			System.out.println(p);
		}
	}
}