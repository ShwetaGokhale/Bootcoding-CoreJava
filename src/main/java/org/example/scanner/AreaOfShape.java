package org.example.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

// Area of Shapes:
//Calculate the area of different shapes (circle, square, triangle) based on user input. Use appropriate formulas for each shape.



public class AreaOfShape
{
    static float pi = 3.14f;
    public static void main(String[] args)
    {
       //For Square

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Side = ");
        int side = obj.nextInt();
        int area  = side * side;

        System.out.println("Area Of Square = "+area);


        //For Circle
        System.out.println("Enter Radius = ");
        float radius = obj.nextFloat();  //float radius = declaration
        double cir = 3.14 * radius * radius;
        System.out.println("Area of Circle = " +cir);

        //For Triangle
        System.out.println("Enter Base  = ");
        int base = obj.nextInt();

        System.out.println("Enter Height  = ");
        int height = obj.nextInt();
        int area1 = (base * height)/2;

        System.out.println("Area Of Triangle = " +area1);
    }
}

