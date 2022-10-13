package org.example;

import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isAdult = true;

        while (isAdult) {

            System.out.println("HOw old are you? ");
            int age = scanner.nextInt();
            if( age >= 18 ) {
                System.out.println(" you are an Adult and welcome ");
            } else {
                System.out.println(" you are too young for income ");
                isAdult = false;

            }
        }
        System.out.println("bye!!");
    }
}
