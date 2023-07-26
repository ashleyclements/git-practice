package com.qa;

public abstract class Shape {
    private String name;
    private String color;
    private double x, y;

    public Shape(String name, String color, double x, double y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract  Point getCenterPoint();
}
