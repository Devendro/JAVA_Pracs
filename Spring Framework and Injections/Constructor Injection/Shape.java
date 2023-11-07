// src/main/java/<package>
// run main.java

package com.springHello;

public class Shape {
    private String shapeType;

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public String toString() {
        return "Shape [shapeType=" + shapeType + "]";
    }
}
