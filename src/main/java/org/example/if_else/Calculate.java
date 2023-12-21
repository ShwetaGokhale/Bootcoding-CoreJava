package org.example.if_else;/*Write  a  program  to  calculate  square  of  number  from  2  to  100  which  is divisible  by 3  and  5*/

public class  Calculate
{
	public  static  void  main(String  args[])
	{
		int  sq  =  0;
		for(int  i  = 2;  i  <=  100;  i++)
		{
			if(i  %  3 == 0  &&  i  %  5 == 0)
			{
				System.out.println(sq = i*i);
			}
		}
	
	}

	public void add(int i, int i1) {
	}
}


//class  Calculate
//{
//	public  static  void  main(String  args[])
//	{
//		for(int  i = 2; i <= 100; i++)
//		{
//			if(i % 3 == 0   &&  i % 5 == 0)
//			{
//				System.out.println(i*i);
//			}
//		}
//	}
//}