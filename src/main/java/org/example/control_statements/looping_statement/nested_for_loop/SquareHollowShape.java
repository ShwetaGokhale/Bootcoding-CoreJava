package org.example.control_statements.looping_statement.nested_for_loop;//Print  square  hollow  shape  using  nested  for  loop

class SquareHollowShape
{
	public static void main(String args[])
	{
		for(int s = 1; s <= 5; s++)
		{
			for(int p = 1; p <= 5; p++)
			{
				if(s == 1  ||  p == 1  ||  s == 5  ||  p == 5)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}