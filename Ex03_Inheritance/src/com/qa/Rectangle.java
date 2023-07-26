package com.qa;

    public class Rectangle extends Shape {

        private double height, width;

        public Rectangle(String name, String color, double x, double y, double height, double width) {
            super(name, color, x, y);
            this.height = height;
            this.width = width;
        }

        @Override
        public double getArea() {
            return width *height;
        }

        @Override
        public Point getCenterPoint() {
            double centx =  (getX() + (0.5*width));
            double centy = getY() + (0.5*height);
            return new Point(centx, centy);
        }

        @Override
        public String toString() {
            return "Rectangle [width = " + width + ", height = " + height + "]";
        }

        public boolean isSquare(){
            return (width == height);
        }
    }
