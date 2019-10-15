package com.company;

public class Car {
    protected String model;
    protected String color;
    protected int capacity;
    protected int yearOfIssue;
    protected String typeOfBox;
    protected int power;

    public Car(String model, String color, int capacity, int yearOfIssue, String typeOfBox, int power) {
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.yearOfIssue = yearOfIssue;
        this.typeOfBox = typeOfBox;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getTypeOfBox() {
        return typeOfBox;
    }

    public void setTypeOfBox(String typeOfBox) {
        this.typeOfBox = typeOfBox;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model = " + model +
                ", color = " + color +
                ", capacity = " + capacity +
                ", yearOfIssue = " + yearOfIssue +
                ", typeOfBox = " + typeOfBox +
                ", power = " + power +
                '}';
    }
}
