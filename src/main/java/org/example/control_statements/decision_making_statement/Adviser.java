package org.example.control_statements.decision_making_statement;

//Weather Adviser:
//Write a program that takes the current temperature as input and advises the user on what to wear (e.g., shorts and t-shirt for high temperatures, coat for cold temperatures).


class Adviser
{
	public static void main(String  args[])
	{
		float temp = 55.5f;
		if(temp == 55.5)
		{
			System.out.println("Temperature is high ... Wear shorts and t-shirt");
		}
		else
		{
			System.out.println("Temperature is cold ... Wear coat");
		}
	}
}