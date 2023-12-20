package org.example.control_statements.decision_making_statement;/*Age   Classifier:
Write  a  Java  program  that  takes  a  person's  age  as  input  and  classifies  them  as  a  child ,  teenager ,  adult ,  or  senior  citizen*/


class  Classifier
{
	public  static  void  main(String  args[])
	{
		int  age  =  66;
		if(age  <= 15)
		{
			System.out.println("Person  is  child");
		}
		else  if(age   >15  &&  age  <= 18  )
		{
			System.out.println("Person  is  teenager");
		}
		else  if(age  >18   &&  age  <=  30)
		{
			System.out.println("Person  is  adult");
		}
		else
		{
			System.out.println("Person  is  senior  citizen");
		}
	}
}