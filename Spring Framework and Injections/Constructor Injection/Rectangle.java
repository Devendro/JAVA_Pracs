// src/main/java/<package>
// run main.java

package com.springHello;

public class Rectangle {
    private int width;
    private int height;
    private Shape shape;

    public Rectangle(int width, int height, Shape shape) {
        this.width = width;
        this.height = height;
        this.shape = shape;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", shape=" + shape + "]";
    }
}
