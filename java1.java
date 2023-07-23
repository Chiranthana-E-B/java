//package java1.java;

import java.util.Scanner;

public class java1 {
    public static void main(String[] args){
        System.out.println("Hello World!");
        int a, b, c;        
        Scanner val = new Scanner(System.in);

        System.out.println("Enter a value:");
        a = val.nextInt();
        System.out.println("Enter b value:");
        b = val.nextInt();

        c=a+b;
        System.out.println("Sum is:"+c);
    }
}