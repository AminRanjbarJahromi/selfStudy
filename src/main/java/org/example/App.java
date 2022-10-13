package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args)
    {
       /*
        Person amin = new Person();
        amin.firstName = "Amin";
        amin.lastname = "Ranjbar";
        amin.age = 35;
        amin.hobby = " Learning Java programing";
        System.out.println(amin.getPersonInformation());
        System.out.println(amin.getFullName());

        */

    Scanner scanner = new Scanner (System.in);
        TestCalculator.displayMenu();
        System.out.println(" Enter number1: ");
        double n1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        double n2 = scanner.nextInt();
        double result = TestCalculator.addition(n1,n2);
        System.out.println(result);







    }

}
