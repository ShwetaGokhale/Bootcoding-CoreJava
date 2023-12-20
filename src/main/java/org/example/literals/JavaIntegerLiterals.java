package org.example.literals;

public class JavaIntegerLiterals
{
   public static void main (String[]args)
   {
       //initialize variables with integer literals
       int decimalNum = 25;
       int hexaNum = 155;	
        
       //initialize variables with boolean literals
        boolean isTrue = true;
        boolean isFalse =false;
       
       //initialize variables with floating point  literals
       double piDoubleValue = 3.1415926535;
       float piFloatValue = 3.1415926535F;
       double piScientific = 3.1415926535e0;

       //print out the values of the literal
       System.out.println("Decimal Integer: " + decimalNum);
       System.out.println("Hexadecimal Integer: " + hexaNum);
       
       //initialize variables with character literals
       char myFirstChar = 'a';
       char mySecondChar = 'b';
       char myThirdChar = 'c';
      
       //initialize variables with string literals
       String myString = "I am a string literal";

       System.out.println("The boolean value of isTrue: " + isTrue);
       System.out.println("The boolean value of isFalse: " + isFalse);

       System.out.println("Pi to ten decimal places: " + piDoubleValue);
       System.out.println("A rounded value of Pi: " + piFloatValue);
       System.out.println("Pi from a scientific notation: " + piScientific);

       System.out.println("First three letters of the alphabet: "+ "\n" +  myFirstChar + "\n" + mySecondChar + "\n" +myThirdChar);
 
       System.out.println("Who am I?  = " + myString);
     }                                                                                                       
}