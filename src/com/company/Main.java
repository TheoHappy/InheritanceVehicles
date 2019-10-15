package com.company;

public class Main {

    public static void main(String[] args) {

        Car Maz103 = new Autobus("Maz-103", "Yellow", 10, 1998, "manual", 300, 4.5f, "touristic");
        Car ScaniaR470 = new Truck("Scania R-470","Red",4,2018,"manual",900,"heavy","lader","Semi-tractors");
        System.out.println(Maz103.toString());
        System.out.println(ScaniaR470.toString());
    }
}
