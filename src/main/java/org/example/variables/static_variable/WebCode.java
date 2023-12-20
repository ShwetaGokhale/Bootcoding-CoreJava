package org.example.variables.static_variable;

class  WebCode
{
	static  int  i;
	public  void  add()
	{
		i++;
	}
	public  static  void  main(String args[])
	{
		WebCode  obj  =  new  WebCode();
		obj.add();
		WebCode  j  =  new  WebCode();
		j.add();
		System.out.println(WebCode.i);
	}
}