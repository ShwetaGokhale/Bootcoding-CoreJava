package org.example.loops;/*Print  Even  Numbers:
Write  a  program  to  print  all  even  numbers  between  1  and  20  using  a  for  loop*/


class   EvenNumbers
{
	public   static  void   main(String args[])
	{
		for(int  i =  1; i <= 20;  i++)
		{
			if( i  % 2 == 0)
			{
				System.out.println("Print  Even  Numbers   =   " +i);	
			}
		}
	} 
}