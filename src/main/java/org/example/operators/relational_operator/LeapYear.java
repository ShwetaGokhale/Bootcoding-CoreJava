package org.example.operators.relational_operator;//Write a program to check whether a given year is a leap year or not.


public  class  LeapYear
{
	public  static  void  main(String args[])
	{
		int  a  =  2016;
		if(a%4==0  &&  a%100!=0)
		{
			System.out.println("Given year is leap year ");
		}
		else
		{
			System.out.println("Given year is not leap year ");	
		}
	}
}