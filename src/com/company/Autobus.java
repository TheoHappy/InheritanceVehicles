package com.company;

public class Autobus extends Car {
    private float length;
    private String typeOfBus;

    public Autobus(String model, String color, int capacity, int yearOfIssue, String typeOfBox, int power, float length, String typeOfBus) {
        super(model, color, capacity, yearOfIssue, typeOfBox, power);
        this.length = length;
        this.typeOfBus = typeOfBus;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(String typeOfBus) {
        this.typeOfBus = typeOfBus;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "model = " + model +
                ", color = " + color +
                ", capacity = " + capacity +
                ", yearOfIssue = " + yearOfIssue +
                ", typeOfBox = " + typeOfBox +
                ", power = " + power +
                ", length = " + length +
                ", typeOfBus = " + typeOfBus +
                '}';
    }
}
