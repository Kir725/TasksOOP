package com.kolmikra.tasksOOP.geometry;

public enum TriangleType {
    EQUILATERAL("Equilateral"), ISOSCELES("Isosceles"), SCALENE("Scalene");
    private String type;

    TriangleType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
