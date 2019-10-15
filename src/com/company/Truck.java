package com.company;

public class Truck extends Car {
    private String size;
    private String frame;
    private String bodyType;

    public Truck(String model, String color, int capacity, int yearOfIssue, String typeOfBox, int power, String size, String frame, String bodyType) {
        super(model, color, capacity, yearOfIssue, typeOfBox, power);
        this.size = size;
        this.frame = frame;
        this.bodyType = bodyType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model = " + model +
                ", color = " + color +
                ", capacity = " + capacity +
                ", yearOfIssue = " + yearOfIssue +
                ", typeOfBox = " + typeOfBox +
                ", power = " + power +
                ", size = " + size +
                ", frame = " + frame +
                ", bodyType = " + bodyType +
                '}';
    }
}
