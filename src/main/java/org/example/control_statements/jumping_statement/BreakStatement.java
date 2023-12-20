package org.example.control_statements.jumping_statement;//Program to print number from 1 to 10.


class BreakStatement
{
	public static void main(String args[])
	{
		for(int k = 1; k <= 10; k++)
		{
			if(k == 5)
			{
				break;
			}
			System.out.println(k);
		}
	}
}