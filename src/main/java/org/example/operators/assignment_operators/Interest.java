package org.example.operators.assignment_operators;//Implement  a  program  to  calculate  the  simple  interest  using  this  formula  (simpleInterest = principal * (1 + rate * time)).


public  class  Interest
{
	public  static  void  main(String args[])
	{
		int  si;
		int  p  =  20;
		int  r  =  10;
		int  t  =  6;
		si = (p*(1+r*t));
		System.out.println("Principle  =  " +p);
		System.out.println("Rate  =  " +r);
		System.out.println("Time  =  " +t);
		System.out.println("Simple Interest  =  " +si);
	}
}