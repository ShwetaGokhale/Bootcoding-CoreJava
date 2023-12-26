package org.example.methods;

public class Division
{
    public int divide(int b , int c)
    {
        int divide = b / c;
        System.out.println("Given Numbers = " +b+"  "+c);
        return divide;
    }
    public static void main(String[] args)
    {
        Division d = new Division();
        int sum = d.divide(4 , 2);
        System.out.println("Division = " +sum);
    }
}
