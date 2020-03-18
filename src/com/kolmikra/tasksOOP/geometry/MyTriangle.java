package com.kolmikra.tasksOOP.geometry;

import java.util.Objects;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=(" + v1.getX() + "," + v1.getY() + ")" +
                ",v2=(" + v2.getX() + "," + v2.getY() + "),v3=(" + v3.getX() + "," + v3.getY() + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTriangle that = (MyTriangle) o;
        return v1.equals(that.v1) &&
                v2.equals(that.v2) &&
                v3.equals(that.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double sideA = v1.distance(v2);
        double sideB = v2.distance(v3);
        double sideC = v3.distance(v1);
        if (Double.compare(sideB, sideA) == 0 && Double.compare(sideB, sideC) == 0) {
            return TriangleType.EQUILATERAL.getType();
        } else if (Double.compare(sideB, sideA) == 0 || Double.compare(sideB, sideC) == 0 || Double.compare(sideA, sideC) == 0) {
            return TriangleType.ISOSCELES.getType();
        }
        return TriangleType.SCALENE.getType();
    }
}
