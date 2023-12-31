package org.example.methods;

public class StringLength
{
    public int  length(String a)
    {
        System.out.println("String = " +a);
        return a.length();
    }
    public static void main(String[] args)
    {
        StringLength s = new StringLength();
        int sum = s.length("Bootcoding");
        System.out.println("Length = " +sum);

    }
//    public void length(String a)
//    {
//        System.out.println("String = " +a);
//        System.out.println("String Length = " +a.length());
//    }
//    public static void main(String[] args)
//    {
//        StringLength s = new StringLength();
//        s.length("bootcoding");
//    }
}
