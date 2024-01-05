package org.example.methods;

public class  Substraction
{
    public int sub(int i , int j)
    {
        int sum = i - j;
        System.out.println("Given Numbers = " +i+"  "+j);
        return sum;
    }
    public static void main(String[] args)
    {
        Substraction s = new Substraction();
        int value = s.sub(30 , 10);
        System.out.println("Substraction = " +value);

    }
}
