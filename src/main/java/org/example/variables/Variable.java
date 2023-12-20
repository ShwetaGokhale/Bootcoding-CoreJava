package org.example.variables;

class Variable
{
	static int c = 30; //STATIC VARIABLE
	int a = 10; //INSTANCE VARIABLE
	public static void main(String args[])
        	{
		int b = 20; //LOCAL VARIABLE
		
		Variable obj = new Variable(); //OBJECT CREATION
		System.out.println("Instance Variable = " +obj.a);
		System.out.println("Local Variable = " +b);
		System.out.println("Static Variable = " +c);
	}
}