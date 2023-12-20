package org.example.control_statements.decision_making_statement;/*Grade Calculator:
Create a program that calculates the final grade for a student based on their scores in exams, assignments, and participation*/


class  GradeCalculator
{
	public  static  void  main(String  args[])
	{
		int  marks  =  49;
		if(marks  >= 89)
		{
			System.out.println("Final Grade Of Student is A");
		}
		else  if(marks  < 89  &&  marks  >= 70)
		{
			System.out.println("Final Grade Of Student is B");
		}
		else  if(marks  < 70   &&  marks  >=  50)
		{
			System.out.println("Final Grade Of Student is C");
		}
		else
		{
			System.out.println("Final Grade Of Student is D");
		}
	}
}