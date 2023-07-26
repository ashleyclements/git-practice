package com.qa;

import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle("square", "red",12, 12, 12,12 );
        Rectangle R2 = new Rectangle("rec", "orange", 22, 14, 12, 12);

        System.out.println(R1.getName() + " Area: " + R1.getArea() + " Center: " + R1.getCenterPoint() + R1.toString());
        System.out.println(R2.getName() + " Area: " + R2.getArea()+ " Center: " + R1.getCenterPoint() + R2.toString());

        Circle c1 = new Circle("2", "blue", 12, 4, 22.2);
        Circle c2 = new Circle("3", "yellow", 12, 5, 15);
        System.out.println(c2);
        System.out.println(c1);

    }
}
