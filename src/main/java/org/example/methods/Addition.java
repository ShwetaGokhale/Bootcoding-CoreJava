package org.example.methods;

public class  Addition
{

    public int add(int x , int y)
    {
        //int sum = x + y;
        //reurn sum;
        System.out.println(" Given Numbers = " +x+"  "+y);
        return x + y;
    }
    public static void main(String[] args)
    {
        Addition a = new Addition();
        int r = a.add(30 , 10);
        System.out.println("Addition = " +r);

    }
}
