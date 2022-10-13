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
    boolean condition = true;
    while (condition){

        TestCalculator.displayMenu();
        System.out.println(" Enter operation type (+ , -)");
        char operationType = scanner.next().charAt(0);
        System.out.println(" Enter number1: ");
        double n1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        double n2 = scanner.nextInt();

        switch (operationType){
            case '+':

                double result = TestCalculator.addition(n1,n2);
                System.out.println(result);
                break;

            case '-':

                System.out.println(TestCalculator.subtraction(n1,n2));
                break;

            default:
                System.out.println("operation type is not valid!");
    }
        System.out.println(" if you want to continue? yes or no : ");
        String continueOperation = scanner.next();
        if(continueOperation.equalsIgnoreCase(" no")) {
            condition = false;

        }



        }




        /*System.out.println(" Enter number1: ");
        double n1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        double n2 = scanner.nextInt();
        double result = TestCalculator.addition(n1,n2);
        System.out.println(result);

*/





    }

}
