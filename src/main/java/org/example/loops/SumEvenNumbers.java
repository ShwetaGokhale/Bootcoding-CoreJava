package org.example.loops;

class   SumEvenNumbers
{
	public   static  void   main(String args[])
	{
		int   sum = 0;
		for(int  i =  1; i <= 15;  i++)
		{
			if( i  % 2 == 0)
			{
				sum = sum +i;		
			}
		}
		System.out.println("Print  Sum  Of  All  Even  Numbers  = "  +sum);
	} 
}