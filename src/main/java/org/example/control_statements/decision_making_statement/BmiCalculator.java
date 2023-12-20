package org.example.control_statements.decision_making_statement;//BMI  Calculator:
//Build  a  BMI  (Body Mass Index)  calculator  that  takes  a  person's  height  and  weight  as  input  and  categorizes  them  as  underweight ,  normal weight ,  overweight , or  obese.



class  BmiCalculator
{
	public  static  void  main(String  args[])
	{
		int  height   =  6;
		int  weight  = 50;
		if( height  ==  8    &&   weight  ==  85)
		{
			System.out.println("Person  is  underweight");
		}
		else  if( height  <=  6   &&   weight  <=  60)
		{
			System.out.println("Person  is  normal  weight");	
		}
		else  if( height  >  9   &&   weight  >  85)
		{
			System.out.println("Person  is  overweight");	
		}
		else
		{
			System.out.println("Person  is  obese");	
		}
	} 
}