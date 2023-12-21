package org.example.methods;

class Calculate
{
    public int add(int a , int b)
    {
        int sum = a + b;
        return sum;
    }


    public static void main(String args[])
    {
        Calculate obj = new Calculate();
        int res = obj.add(10, 20);
        System.out.println(res);


    }
}
				