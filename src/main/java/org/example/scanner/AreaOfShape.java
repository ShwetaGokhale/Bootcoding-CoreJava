package org.example.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfShape
{
    public static void main(String[] args)
    {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no = ");
        int b = obj.nextInt();
        a = b * b;



        System.out.println("Area Of Square = "+a);
    }
}
