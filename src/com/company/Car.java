package com.company;

public class Car {
    int regNumber;
    String carBrand;
    float engineVol;

    void printIdInfo () {
        System.out.println("Registration number: " + regNumber + "; ");
        System.out.println("Brand of the car: " + carBrand + "; ");
        System.out.println("The engine volume:  " + engineVol + ";");
    }
}
