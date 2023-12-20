package org.example.control_statements.looping_statement.nested_for_loop;

class RightHalfPyramid
{
	public static void main(String args[])
	{
		for(int b = 1; b <= 5; b++)
		{
			for(int d = 1; d <= b; d++)
			{
				System.out.print(" * ");
			}
		System.out.println();
		}
		
	}
}