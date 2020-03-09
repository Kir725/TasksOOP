package com.kolmikra.tasksOOP;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float weght) {
        this.length = length;
        this.width = weght;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWeght() {
        return width;
    }

    public void setWeght(float weght) {
        this.width = weght;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimetr() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[length= " + length + ", width= " + width + "]";
    }
}
