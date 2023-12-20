package org.example.variables.instance_variable;

class Person
{
	String name;
	int age;
	String address;
	public static void main(String args[])
	{
		Person obj = new Person();
                                     obj.name = "Shweta";
		obj.age = 21;
		obj.address ="Nagpur";
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.address);
	}
}