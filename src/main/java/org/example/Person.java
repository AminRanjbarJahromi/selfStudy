package org.example;

public class Person {
    String firstName;
    String lastname;
    int age;
    String hobby;

    public String getPersonInformation(){
        return firstName + " " + lastname + " is " +  age + " years old and " + hobby;


    }

    public String getFullName(){
        return firstName + " " + lastname;
    }


}
