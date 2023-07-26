package com.qa;

public class TestPizza {
    public static void main(String[] args) {
       String[] toppings= {"pepperoni", "mushroom", "xCheese", "veggie"};
       Pizza p1 = new Pizza("L", toppings, 17.91);
       Pizza p2 = new Pizza("M", toppings, 12.76);
       Pizza p3 = new Pizza("XL", toppings, 22.67);

        //System.out.println(p1);
        Pizza[] pizzaorders = new Pizza[3];
        pizzaorders[0] = p1;
        pizzaorders[1] = p2;
        pizzaorders[2] = p3;

        for (int ii = 0; ii < pizzaorders.length; ii++){
            System.out.println(pizzaorders[ii]);
        }
    }
}
