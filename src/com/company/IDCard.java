package com.company;

public class IDCard {
    int idNumber;
    String name;
    String gender;

    void printIdInfo () {
        System.out.println("ID Number: " + idNumber + ";");
        System.out.println("Full name: " + name + ";");
        System.out.println("Gender:  " + gender + ";");
    }

}
