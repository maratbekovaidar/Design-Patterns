/**
 Code written by Aidar Maratbekov 3.10.2021.  Copyright (c)
 */

package kz.maratbekovaidar;

public class Main {
    public static void main(String[] args) {
        Burger burger1 = new LargeBurger(new SpicyBurger(new DefaultBurger()));
        Burger burger2 = new LargeBurger(new SpicyBurger(new CheeseBurger(new DefaultBurger())));

        System.out.println("Burger with 2 cutlet and Spicy Souse: " + burger1.getPrice());
        System.out.println("Maximal burger: " + burger2.getPrice());
    }
}
